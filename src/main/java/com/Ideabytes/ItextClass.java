package com.Ideabytes;

import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
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

//import sun.font.FontFamily;

public class ItextClass extends MakeField {
    private java.util.List<String> strArray = new ArrayList<String>();
    private static int lineSize;
    private static int fontSize;
    private PageSize ps = PageSize.A4;;
    private Document document;
    private PdfFont font;
    private Style normal;
    private PdfDocument pdf;
    private double boxY = 0;
    private double previousBoxY = 0;
    private double maxLine = 0;

    public ItextClass(int lineSize, int fontSize) {
        this.lineSize = lineSize;
        this.fontSize = fontSize;
    }

    public void makePDF() {

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
            int num = FontProgramFactory.registerFontDirectory(Constants.FONT_DIRECTORY);

            int offSet = 36;
            float columnWidth = (float) (lineSize+500); //Sets width of rectangle
            columnWidth = (float) ((float) columnWidth);

            float columnHeight = ps.getHeight() - offSet * 2;
            com.itextpdf.kernel.geom.Rectangle[] columns = {
                    new com.itextpdf.kernel.geom.Rectangle(offSet - 5, offSet, (int) columnWidth, (int) columnHeight)
            };
            //columns.stroke();
            document.setRenderer(new ColumnDocumentRenderer(document, columns));

            normal = new Style();
            font = PdfFontFactory.createFont(Constants.FONT_DIRECTORY+"\\Arial.ttf");


            // int actualFontWidth = font.getWidth("a")* fontSize / FontProgram.UNITS_NORMALIZATION;
            normal.setFont(String.valueOf(font)).setFontSize(fontSize);
                /*
                while (i < (inputLines.get(i).length() * lineSize + 1)) {
                    document.add(new Paragraph(inputLines.get(i)));
                    i++;
                }

                 */

        }
        catch (Exception e) {
System.out.println("Exception happened " + e.getMessage());
        }
            //addArticle(document, inputLines, "2Luka", pdfImg, font, normal);

            //addArticle(document, "Some small fudged text Made up by LM", "LM", pdfImg, font, normal);

        }

        public void closePdf(String input) {
            try {
            //document.add(new Paragraph(lSb.toString()).setFont(font).addStyle(normal));
            //PageSize ps = PageSize.A4.rotate();

            PdfPage page = pdf.addNewPage(ps);
            PdfCanvas canvas = new PdfCanvas(page);
            //canvas.concatMatrix(1, 0, 0, 1, ps.getWidth() / 2, ps.getHeight() / 2);
            canvas.moveTo(lineSize, -(ps.getHeight() / 2)).lineTo(lineSize, ps.getHeight() / 2).stroke();
            canvas.stroke();
            BarcodeQRCode barcodeQRCode = new BarcodeQRCode("https://www.ideabytes.com/", null);
            barcodeQRCode.placeBarcode(canvas, null, 2);


            document.close();

        } catch (Exception e) {
            System.out.println("failed");
        }
    }

    public void addArticle(String inText) throws Exception {
        boxY = boxY + numlines(inText)*1.6*fontSize;
        Paragraph p1 = new Paragraph(inText);

        p1.setFont(font).addStyle(normal).setWidth(setMaxWidth(inText)+500).setFixedPosition(30,(float)(806-boxY),1000);

        document.add(p1);
        //doc.add(img);
        Paragraph p2 = new Paragraph().setFontSize(7);
        document.add(p2);
        p1.getHeight();
        int num = setMaxWidth(inText);
        manipulatePdf(inText);
        System.out.println(num+"numprinted");



    }
    public void addForm(){
        PdfAcroForm form = PdfAcroForm.getAcroForm(document.getPdfDocument(), true);
        PdfTextFormField nameField = PdfTextFormField.createText(document.getPdfDocument(), new com.itextpdf.kernel.geom.Rectangle(99, 820, 425, 15), "name", "");
        form.addField(nameField);
    }

    public void manipulatePdf( String paragraph)   {
        try {

            PdfPage currentPage = pdf.getPage(1);
            PdfCanvas canvas = new PdfCanvas(currentPage);
            // Create a 100% Magenta color
            //Rectangle mediabox = currentPage.getMediaBox();
            //p1.setWidth(psize + 100);
            //System.out.println("P1 width " + p1.getWidth().getValue());

            //p1.setBorderRight(new SolidBorder(2));
            float box = 200.5f;

            canvas

                    .moveTo(30, 806-boxY)
                    .lineTo(setMaxWidth(paragraph)+35, 806-boxY)
                    .lineTo(setMaxWidth(paragraph)+35, 806-previousBoxY )
                    .lineTo(30, 806-previousBoxY)
                    .closePathStroke();
            previousBoxY = boxY;
            //document.add((IBlockElement) canvas);
            //currentPage.add(canvas);

        }
        catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    }

    /***************************************
     * function to determine the amount of lines in each entered text
     * @param input text which will have number of lines counted
     * @return number of lines
     ***************************************/
    int numlines(String input)
    {
        int j = 0;
        for (int i = 0;i<input.length();i++)
        {
            if (input.charAt(i)=='\n')
            {
                j++;
            }
        }
        return j;
    }

    /**********************************************************
     * Determines the line of each text with the most width; used later to calculate width of boxes
     * @param input text being counted
     * @return the width of the longest line
     **********************************************************/
    int setMaxWidth (String input) {
        int i = 0;
        int current;


        while (i<input.length()) {
            String tmp = "";
            while (input.charAt(i)!='\n') {
                tmp=tmp+input.charAt(i);
                i++;
            }
            current = font.getWidth(tmp) * fontSize / FontProgram.UNITS_NORMALIZATION;
            if(maxLine<current)
            {
                maxLine = current;
            }
            i++;
        }
        return (int) maxLine;
    }
}
