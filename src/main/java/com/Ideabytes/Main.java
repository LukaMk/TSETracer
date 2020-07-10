package com.Ideabytes;
import com.Ideabytes.jsonpojo.PersonData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*************************************************************************
 * Ideabytes Inc.
 * Author: Luka Macieszczak
 * Date: July 6, 2020
 * Purpose: to take user input to convert number of pixels and font size
 * to number of characters which fit in one line to wrap text
 ************************************************************************/
public class Main {
private static String paragraph = "";
public static void main(String[] args) throws Exception {

        int a = PixelFont.inputWidth();
        int c = PixelFont.inputFontSize();

        initDb(a,c);


        /*
        JFrame frame = new JFrame(Constants.CANVAS_TITLE);
        CanvasFile canvas = new CanvasFile(lWrapedText, wrapper.characters(), c);
        canvas.setSize(a, 1000);
        frame.setSize(1000, 1000);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         */

    }
    // Function to handel sql statements; Creates table with string,
    //@param a amount of horizontal pixels
    //@param c font size
    public static void initDb(int a, int c) throws Exception {

        try {
            WrapText wrapper = new WrapText(a,c);
            String lWrapedText = null;
            Connection conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            System.out.println("Correct");

            // Open PDF doc and initialize styles
            ItextClass wrapPDF = new ItextClass(a,c);
            wrapPDF.makePDF();


            Statement statement = conn.createStatement();
            statement.execute(Constants.SQL_CREATETABLE);
            ResultSet results;
            statement.execute(Constants.SQL_SELECT_GETPAR);
            results = statement.getResultSet();
            wrapPDF.addForm();
            while (results.next()) {
                paragraph = results.getString(2);
                if (paragraph != null && !paragraph.isEmpty()) {
                    lWrapedText = wrapper.wrap(paragraph);
                    wrapPDF.addArticle(lWrapedText);
                }
            }

            //wrapPDF.addArticle(lWrapedText);

            results.close();
            statement.close();
            conn.close();
            wrapPDF.closePdf(lWrapedText);


            //jsonTest();
            readFromDb();


        } catch (SQLException | IOException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }

    }

    private static void jsonTest()  {
        PersonData p1 = new PersonData("Joey", "Lucky" , new Date(2003, 9, 20), Arrays.asList("Joe", "Shmoe"));
        System.out.println(p1.toString());
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(p1);
            System.out.println(jsonString);
        }
        catch (Exception e) {

        }


    }

    private static void readFromDb() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            Statement statement = conn.createStatement();
            ResultSet results;
            statement.execute("SELECT * FROM JSONTable");
            results = statement.getResultSet();
            String toConvert =  results.getString(1);
            if (toConvert != null && !toConvert.isEmpty()) {
                ObjectMapper mapper = new ObjectMapper();
                PersonData personFromDb = mapper.readValue(toConvert, PersonData.class);
                System.out.println("Found in Db: " + personFromDb.toString());

            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }


    }


}