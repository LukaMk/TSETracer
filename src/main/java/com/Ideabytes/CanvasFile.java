package com.Ideabytes;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class CanvasFile extends Canvas {

    private String inputLines;
    private  java.util.List<String> strArray = new ArrayList<String>();
    private int lineSize;
    private int fontSize;


    public CanvasFile(String inputLines, int lineSize, int fontSize) {
        this.inputLines = inputLines;
        this.lineSize = lineSize;
        this.fontSize = fontSize;
    }

    public void paint(Graphics g) {

        Button button = new Button("Font");
        button.setBounds(500,500,50,50);
        g.setColor(Color.RED);
        int i = 0;
      /*  Font font = new Font("Verdana", Font.BOLD, c);
        setFont(font); */


            g.drawString(inputLines, 25, (int) (Constants.MULTIPLIER * fontSize) * i+25);



        /*
        WrapText wrap2 = new WrapText(a, b, c);
        display = "";

        i = 0;
        while (i++ < (display.length() * wrap2.characters() + 1)) {
            wrap2.setLineNum(i);
            display = wrap2.wrap(Constants.par2);
            g.drawString(display, 500, (int) (Constants.MULTIPLIER * c) * i);

        } */


    }


}
