package com.Ideabytes;

import com.Ideabytes.jsonpojo.AdditionalDoc;
import com.Ideabytes.jsonpojo.PageCommonDynamicDetails;
import com.Ideabytes.jsonpojo.ShippingDoc;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.*;
import java.util.*;

/*************************************************************************
 * Ideabytes Inc.
 * @author Luka Macieszczak
 * Date: July 6, 2020
 * Purpose: to print pdf wit paragraphs stored in databases
 * to number of characters which fit in one line to wrap text
 ************************************************************************/

public class Main {

    static String setVerbose;
    static boolean verbose = false;
    static TSEHandler tseHandler = null;


    /**
     * @param args
     */
public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        setVerbose = sc.next();
        if (setVerbose.equals("verbose")) {
            verbose = true;
        }
        tseHandler = new TSEHandler("WrapTextExample", Constants.TSE_CONNECTION_STRING,verbose);
        tseHandler.addMethod("Main","main", Arrays.asList(new Parameter("args", args)));
        int a = PixelFont.inputWidth();
        int c = PixelFont.inputFontSize();
        initDb(a,c);
        tseHandler.setReturnForResult("Main", "main",new Result("main method","void"));
        tseHandler.close();
    }

    /**
     * Creates connection to DB and sends stored paragraphs from table to get wrapped and be printed to pdf
     * @param numPixels Amount of pixels for width - int
     * @param fontSize Font size - int
     */
    public static void initDb(int numPixels, int fontSize)  {
        tseHandler.addMethod("Main","initDB", Arrays.asList(new Parameter("numPixels", numPixels), new Parameter("fontSize", fontSize)));
        try {
            WrapText wrapper = new WrapText(numPixels,fontSize, tseHandler);
            wrapper.setTseHandler(tseHandler);
            String lWrapedText = null;
            Connection conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            System.out.println("Correct");

            // Open PDF doc and initialize styles
            ItextClass wrapPDF = new ItextClass(numPixels,fontSize, tseHandler);
            wrapPDF.setTseHandler(tseHandler);
            wrapPDF.makePDF();
            Statement statement = conn.createStatement();
            statement.execute(Constants.SQL_CREATETABLE);
            ResultSet results;
            statement.execute(Constants.SQL_SELECT_GETPAR);
            results = statement.getResultSet();
            wrapPDF.addForm();
            int i = 0;
            while (results.next()) {
                String paragraph = results.getString(2);
                if (paragraph != null && !paragraph.isEmpty()) {
                    lWrapedText = wrapper.wrap(paragraph);
                }
                wrapPDF.addArticle(lWrapedText);
                i++;
            }
            wrapPDF.manipulatePdf(i);

            //wrapPDF.addArticle(lWrapedText);

            results.close();
            statement.close();
            conn.close();
            wrapPDF.closePdf();


            //jsonTest();
            readFromDb();


        } catch (SQLException | IOException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    tseHandler.setReturnForResult("Main","initDB", new Result("Initialize DB input text for wrap", "void"));
    }


    /**
     * Reads content of table from database where each row contains a JSON object
     * Converts JSON object into POJO that has been defined in package com.Ideabytes.jsonpojo
     * @return list of {@link com.Ideabytes.jsonpojo.ShippingDoc}
     */
    public static List<ShippingDoc> readFromDb() {
        tseHandler.addMethod("Main","readFromDB", Collections.emptyList());
        Connection conn = null;
        ObjectMapper mapper = new ObjectMapper();
        List<ShippingDoc> lResult = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            Statement statement = conn.createStatement();
            ResultSet results;
            statement.execute("SELECT * FROM JSONTable");
            results = statement.getResultSet();
            while (results.next()) {
                String toConvert = results.getString(1);
                if (toConvert != null && !toConvert.isEmpty()) {
                    ShippingDoc[] lineFromDb = mapper.readValue(toConvert, ShippingDoc[].class);
                    if (lineFromDb != null && lineFromDb.length != 0) {
                        System.out.println("Found in Db: " + lineFromDb[0].toString());
                        PageCommonDynamicDetails pageCommonDynamicDetails = lineFromDb[0].getPageCommonDynamicDetails();
                        System.out.println("info getShipmentMetaDataDeclarationType " + pageCommonDynamicDetails.getShipmentMetaDataDeclarationType());
                        for(AdditionalDoc docs : lineFromDb[0].getAdditionalDocs() )
                        {
                            System.out.println("additional docs " + docs.getPrintDocsOrderDocCategory());
                        }
                        lResult.add(lineFromDb[0]);
                    }

                }
            }


        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        tseHandler.setReturnForResult("Main","readFromDB", new Result("Prints JSON object",lResult));
        return lResult;


    }


}