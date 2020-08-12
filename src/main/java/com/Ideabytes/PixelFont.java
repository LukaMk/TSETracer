package com.Ideabytes;
//import scanner

import java.util.Scanner;


/*************************************************************************
 * Ideabytes Inc.
 * @author  Luka Macieszczak
 * Date: June 12, 2020
 * Purpose: to take user input to convert number of pixels and font size
 * to number of characters which fit in one line to wrap text
 ************************************************************************/
public class PixelFont {
    /**
     * input width of paragraph in pixels
     * @return width
     */
    public static int inputWidth() {
        Scanner sc = new Scanner(System.in);
        //Adds scanner for user input
        //Asks user to input amount of pixels
        System.out.print("Enter amount of pixels");
        //Input pixels, when making part of a site you could know how much room you have so you put that number in
        int numPixels = sc.nextInt();
        return numPixels;
    }

  /*  public static int inputHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of pixels");
        //Input pixels, when making part of a site you could know how much room you have so you put that number in
        int c = sc.nextInt();
        return c;
    }*/

    /**
     * input font size
     * @return font size
     */
    public static int inputFontSize() {
        Scanner sc = new Scanner(System.in);
        //Asks user for font size
        System.out.print("Enter font size");
        //This can be changed to a constant but a an example here you chose the font size
        int fontSize = sc.nextInt();
        //Sends int a and b to WrapText class
        return fontSize;

    }

}



