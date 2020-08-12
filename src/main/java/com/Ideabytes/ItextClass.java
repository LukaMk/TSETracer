package com.Ideabytes;

import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.ColumnDocumentRenderer;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*******************************************************************
 * Ideabytes Inc.
 * Luka Macieszczak
 * July 29th, 2020
 * Purpose: Prints inputted text to pdf and creates borders
 ********************************************************************/
public class ItextClass extends Tracer {
    private static int lineSize;
    private static int fontSize;
    private final PageSize ps = PageSize.A4;
    ;
    private Document document;
    private PdfFont font;
    private Style normal;
    private PdfDocument pdf;
    private ArrayList<Double> boxY;
    //private double[] previousBoxY;
    private double maxLine = 0;
    boolean verbose = true;

    /**
     * Constructor
     *
     * @param lineSize The length of the line in pixels - int
     * @param fontSize The size of the font - int
     */
    public ItextClass(int lineSize, int fontSize, TSEHandler tseHandler) {
        tseHandler.addMethod("ItextClass","ItextClass",Arrays.asList(new Parameter("lineSize", lineSize), new Parameter("fontSize", fontSize)));
        this.lineSize = lineSize;
        this.fontSize = fontSize;
        tseHandler.setReturnForResult("ItextClass","ItextClass",new Result("Constructor for ItextClass", "void"));
        this.boxY = new ArrayList<>();
    }

    /**
     * Method that deletes old pdf and creates new one to be re written;
     * adds watermark to middle of page;
     * Creates column so watermark can overlap text
     */
    public void makePDF() {
        tseHandler.addMethod("ItextClass", "makePDF", Collections.emptyList());

        try {
            File file = new File(Constants.FILE_OUTPUT);
            if (file.exists()) {
                file.delete();
            }


            OutputStream fos = new FileOutputStream(Constants.FILE_OUTPUT);
            PdfWriter writer = new PdfWriter(fos);
            pdf = new PdfDocument(writer);
            ImageData imageData = ImageDataFactory.create(Constants.PREVIEW_IMAGE);
            Image pdfImg = new Image(imageData);
            document = new Document(pdf, ps);

            pdfImg.setOpacity((float) 0.5); //Changes image opacity
            pdfImg.setRotationAngle(Math.toRadians(45)); //Rotates image 45 degrees
            document.add(pdfImg);
            //int num = FontProgramFactory.registerSystemFontDirectories();

            int offSet = 36;
            float columnWidth = (float) (lineSize + 500); //Sets width of rectangle


            float columnHeight = ps.getHeight() - offSet * 2;
            com.itextpdf.kernel.geom.Rectangle[] columns = {
                    new com.itextpdf.kernel.geom.Rectangle(offSet - 5, offSet, (int) columnWidth, (int) columnHeight)
            };
            //columns.stroke();
            document.setRenderer(new ColumnDocumentRenderer(document, columns));

            normal = new Style();
            font = PdfFontFactory.createFont(Constants.FONT_DIRECTORY + "\\Arial.ttf");


            // int actualFontWidth = font.getWidth("a")* fontSize / FontProgram.UNITS_NORMALIZATION;
            normal.setFont(String.valueOf(font)).setFontSize(fontSize);
        } catch (Exception e) {
            System.out.println("Exception happened " + e.getMessage());
        }
        tseHandler.setReturnForResult("ItextClass", "makePDF", new Result("Deletes old pdf if exists and makes new one, adds watermark and column", "void"));
    }

    /**
     * Method to print qr code and close document
     */
    public void closePdf() {
        tseHandler.addMethod("ItextClass", "closePDF", Collections.emptyList());
        try {
            PdfPage page = pdf.addNewPage(ps);
            PdfCanvas canvas = new PdfCanvas(page);
            canvas.moveTo(lineSize, -(ps.getHeight() / 2)).lineTo(lineSize, ps.getHeight() / 2).stroke();
            canvas.stroke();
            BarcodeQRCode barcodeQRCode = new BarcodeQRCode("https://www.ideabytes.com/", null);
            barcodeQRCode.placeBarcode(canvas, null, 2);
            tseHandler.setReturnForResult("ItextClass","closePdf", new Result("Closes pdf document and adds QR code", "void"));
            document.close();

        } catch (Exception e) {
            System.out.println("failed");
        }
    }

    /**
     * Method to print text to pdf
     *
     * @param inText text being sent from database after being wrapped
     */
    public void addArticle(String inText) {
        tseHandler.addMethod("ItextClass", "addArticle", Arrays.asList(new Parameter("inText", inText)));
        try {
                if (boxY.isEmpty()) {
                    boxY.add(numLines(inText) * 1.6 * fontSize);
                }
                else {
                    boxY.add(boxY.get(boxY.size() - 1) + numLines(inText) * 1.6 * fontSize);
                }

            Paragraph p1 = new Paragraph(inText);

                p1.setFont(font).addStyle(normal).setWidth(setMaxWidth(inText) + 500).setFixedPosition(30, (float) (806 - boxY.get(boxY.size()-1)), 1000);

            document.add(p1);
            Paragraph p2 = new Paragraph().setFontSize(7);
            document.add(p2);
            p1.getHeight();
            int num = setMaxWidth(inText);
            System.out.println(num + "numprinted");
        } catch (Exception e) {
            System.out.println(e);
        }

    tseHandler.setReturnForResult("ItextClass", "addArticle", new Result("Adds input text to pdf","void"));
    }

    /**
     * Creates form on pdf
     */

    public void addForm() {
        tseHandler.addMethod("ItextClass", "addForm", Collections.emptyList());
        PdfAcroForm form = PdfAcroForm.getAcroForm(document.getPdfDocument(), true);
        PdfTextFormField nameField = PdfTextFormField.createText(document.getPdfDocument(), new com.itextpdf.kernel.geom.Rectangle(99, 820, 425, 15), "name", "");
        form.addField(nameField);
        tseHandler.setReturnForResult("ItextClass", "addForm", new Result("Adds form to pdf","void"));
    }

    /**
     * Method to print borders around paragraphs to pdf
     *
     *
     */
    public void manipulatePdf(int num) {
        tseHandler.addMethod("ItextClass", "manipulatePdf", Collections.emptyList());
        try {

            PdfPage currentPage = pdf.getPage(1);
            PdfCanvas canvas = new PdfCanvas(currentPage);


                for (int i = 0;i<num;i++) {
                    if (boxY.size() - i == boxY.size()) {


                    } else if (boxY.size()-1-i<0){
                        canvas.moveTo(30, 806 - boxY.get(boxY.size() - i ))
                                .lineTo(maxLine + 35, 806- boxY.get(boxY.size() -i ) )
                                .lineTo(maxLine + 35, 806  )
                                .lineTo(30, 806 )
                                .closePathStroke();
                    }
                    else{
                        canvas.moveTo(30, 806 - boxY.get(boxY.size()-i))
                                .lineTo(maxLine + 35, 806 - boxY.get(boxY.size() - i))
                                .lineTo(maxLine + 35, 806 - boxY.get(boxY.size() - i - 1))
                                .lineTo(30, 806 - boxY.get(boxY.size() -i - 1))
                                .closePathStroke();
                    }
                }
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
        tseHandler.setReturnForResult("ItextClass","manipulatePdf",new Result("Adds boxes around paragraphs", "void"));
    }

    /***************************************
     * function to determine the amount of lines in each entered text
     * @param input text which will have number of lines counted - String
     * @return number of lines - int
     ***************************************/
    int numLines(String input) {

        tseHandler.addMethod("ItextClass", "numLines", Arrays.asList(new Parameter("input", input)));
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                j++;
            }
        }
        tseHandler.setReturnForResult("ItextClass","numLines",new Result("Determines the amount of lines in text", j));
        return j;
    }

    /**********************************************************
     * Determines the line of each text with the most width; used later to calculate width of boxes
     * @param input text being counted - String
     * @return the width of the longest line - int
     **********************************************************/
    int setMaxWidth(String input) {
        tseHandler.addMethod("ItextClass", "setMaxWidth", Arrays.asList(new Parameter("input", input)));
        int i = 0;
        int current;


        while (i < input.length()) {
            String tmp = "";
            while (input.charAt(i) != '\n') {
                tmp = tmp + input.charAt(i);
                i++;
            }
            current = font.getWidth(tmp) * fontSize / FontProgram.UNITS_NORMALIZATION;
            if (maxLine < current) {
                maxLine = current;
            }
            i++;
        }
        tseHandler.setReturnForResult("ItextClass","setMaxWidth",new Result("Sets max width of line",maxLine));
        return (int) maxLine;
    }
}
