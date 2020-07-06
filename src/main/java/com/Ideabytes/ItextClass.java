package com.Ideabytes;

import com.itextpdf.barcodes.BarcodeQRCode;
import com.itextpdf.io.font.FontConstants;
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
//import sun.font.FontFamily;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItextClass {
    private java.util.List<String> inputLines;
    private  java.util.List<String> strArray = new ArrayList<String>();
    private static int lineSize;
    private static int fontSize;

    public ItextClass(List<String> aInArray, int lineSize, int fontSize) {
        this.inputLines = aInArray;
        this.lineSize = lineSize;
        this.fontSize = fontSize;
    }
    public void makePDF(){
        int i = 0;

            try {
                File file = new File(Constants.FILE_OUTPUT);
                if (file.exists()){
                    file.delete();
                }
                OutputStream fos = new FileOutputStream(Constants.FILE_OUTPUT);
                PdfWriter writer = new PdfWriter(fos);
                PdfDocument pdf = new PdfDocument(writer);
                ImageData imageData = ImageDataFactory.create(Constants.PREVIEW_IMAGE);
                Image pdfImg = new Image(imageData);
                PageSize ps = PageSize.A4;
                Document document = new Document(pdf, ps);
                pdfImg.setOpacity((float) 0.5);
                pdfImg.setRotationAngle(Math.toRadians(45));
                document.add(pdfImg);
                int offSet = 36;
                float columnWidth = lineSize;
                float columnHeight = ps.getHeight()-offSet*2;
                com.itextpdf.kernel.geom.Rectangle[] columns = {
                        new com.itextpdf.kernel.geom.Rectangle(offSet - 5, offSet,(int) columnWidth,(int) columnHeight)
                };
                //columns.stroke();
                document.setRenderer(new ColumnDocumentRenderer(document, columns));

                Style normal = new Style();
                Scanner sc = new Scanner(System.in);
                System.out.println("pick a number between 1 and 3\n1 is for times roman\n2is for helvetica\n3 is for Courier");
                int choseFont = sc.nextInt();
                PdfFont font;
                if(choseFont==1)
                {
                    font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                }
                else if(choseFont==2)
                {
                    font = PdfFontFactory.createFont(FontConstants.HELVETICA);
                }
                else if(choseFont==3)
                {
                    font = PdfFontFactory.createFont(FontConstants.COURIER);
                }
                else
                {
                    font = PdfFontFactory.createFont(FontConstants.TIMES_ITALIC);
                }

                normal.setFont(font).setFontSize(fontSize);
                /*
                while (i < (inputLines.get(i).length() * lineSize + 1)) {
                    document.add(new Paragraph(inputLines.get(i)));
                    i++;
                }

                 */
                StringBuilder lSb = new StringBuilder();
                for (String line : inputLines) {
                    lSb.append(line);
                }
                addArticle(document,lSb.toString(),"2Luka",pdfImg,font,normal);
                //document.add(new Paragraph(lSb.toString()).setFont(font).addStyle(normal));
                //PageSize ps = PageSize.A4.rotate();
                PdfPage page = pdf.addNewPage(ps);
                PdfCanvas canvas = new PdfCanvas(page);
                //canvas.concatMatrix(1, 0, 0, 1, ps.getWidth() / 2, ps.getHeight() / 2);

                canvas.moveTo(lineSize, -(ps.getHeight()/2)).lineTo(lineSize, ps.getHeight()/2).stroke();
                canvas.stroke();
                BarcodeQRCode barcodeQRCode = new BarcodeQRCode("https://www.ideabytes.com/", null);
                barcodeQRCode.placeBarcode(canvas, null, 2);




                document.close();

            }
            catch(Exception e){
                System.out.println("failed");
            }
        }
    public static void addArticle(Document doc, String title, String author, Image img,PdfFont font, Style normal) {
        Paragraph p1 = new Paragraph(title).setFont(font).addStyle(normal).setWidth((float) (lineSize/1.77)).setBorder(new SolidBorder(1));
        //p1.setWidth((float)lineSize);
        //p1.setBorderRight(new SolidBorder(1));
        doc.add(p1);
        //doc.add(img);
        Paragraph p2 = new Paragraph()
                .setFontSize(7)
                .add(author);
        doc.add(p2);


    }

}
