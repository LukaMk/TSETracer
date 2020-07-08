package com.Ideabytes;

import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.ColumnDocumentRenderer;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.font.FontProvider;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
//import sun.font.FontFamily;
import javax.swing.*;
import javax.swing.text.StyleConstants;
import java.awt.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItextClass {
    private java.util.List<String> strArray = new ArrayList<String>();
    private static int lineSize;
    private static int fontSize;
    private PageSize ps = PageSize.A4;;
    private Document document;
    private PdfFont font;
    private Style normal;
    private PdfDocument pdf;

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
            int num = FontProgramFactory.registerFontDirectory("C:\\Users\\luka\\Documents\\SampleFonts");

            int offSet = 36;
            float columnWidth = (float) (lineSize / 1.33); //Sets width of rectangle
            columnWidth = (float) ((float) columnWidth);

            float columnHeight = ps.getHeight() - offSet * 2;
            com.itextpdf.kernel.geom.Rectangle[] columns = {
                    new com.itextpdf.kernel.geom.Rectangle(offSet - 5, offSet, (int) columnWidth, (int) columnHeight)
            };
            //columns.stroke();
            document.setRenderer(new ColumnDocumentRenderer(document, columns));

            normal = new Style();
            font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);


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

        public void closePdf() {
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

    public void addArticle(String inText) {
        Paragraph p1 = new Paragraph(inText).setFont(font).addStyle(normal).setWidth(calcMargin(lineSize, fontSize)).setBorder(new SolidBorder(1));
        document.add(p1);
        //doc.add(img);
        Paragraph p2 = new Paragraph()
                .setFontSize(7);
        document.add(p2);


    }

    private static float calcMargin(int lineSize, int fontSize) {
        float num = (float) (lineSize / 1.33);
        return num;
    }
}
