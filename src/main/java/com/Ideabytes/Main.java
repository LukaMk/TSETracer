package com.Ideabytes;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
private static String paragraph = "";
public static void main(String[] args) {

        int a = PixelFont.inputWidth();
        int c = PixelFont.inputFontSize();
        WrapText wrapper = new WrapText(a,c);
        List<String> lWrapedText = new ArrayList<String>();

        try {
            Connection conn = DriverManager.getConnection(Constants.CONNECTION_STRING);
            System.out.println("Correct");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS paragraph1 (row INTEGER, paragraph TEXT)");
            ResultSet results;
            statement.execute("SELECT * FROM paragraph1");
            results = statement.getResultSet();
            while (results.next()) {
                paragraph = paragraph + results.getString(2);
            }
            lWrapedText = wrapper.wrapAll(paragraph);
            ItextClass wrapPDF = new ItextClass(lWrapedText,a,c);
            wrapPDF.makePDF();
            results.close();
            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }

        JFrame frame = new JFrame("My Drawing");
        CanvasFile canvas = new CanvasFile(lWrapedText, wrapper.characters(), c);
        canvas.setSize(a, 1000);
        frame.setSize(1000, 1000);
        frame.add(canvas);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}