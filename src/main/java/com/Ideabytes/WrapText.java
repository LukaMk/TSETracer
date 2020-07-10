package com.Ideabytes;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;

import java.io.IOException;

/***************************************************************************
 * Ideabytes Inc.
 * Author: Luka Macieszczak
 * Date: June 12, 2020
 * Purpose: Take inputed data and return wrapped text based on pixels and font size
 ***************************************************************************/

//new public class
public class WrapText {
    //Creating variables
    private final int numPixelsWidth;
    //private final int numPixelsHeight;
    private int numFontSize;


    //private String enteredText;

    //Constructor
    public WrapText(int a, int c) {
        this.numPixelsWidth = a;
        //this.numPixelsHeight = b;
        this.numFontSize = c;

    }
    //determines the amount of characters would fit in the given space

    /*****************************************************************************
     *Function to cut off word after the last space
     * @param firstString string before modified
     * @param toBeInserted whatever you want to insert into firstString
     * @param index The index at which toBeInserted will be put into firstString
     *****************************************************************************/
    public String insertString(String firstString, String toBeInserted, int index) {
        String newString = "";
        for (int f = 0; f < firstString.length(); f++) {

            //Insert the original string character
            //into the new string
            newString += firstString.charAt(f);

            if (f == index) {

                // Insert the string to be inserted
                // into the new string
                newString += toBeInserted;
            }
        }
        return (newString);
    }
    /*****************************************************************************
     *Determines the amount of characters that will fit in each line based on font size
     * @param text sends entire string to function
     *****************************************************************************/
    private float getWidth(String text) throws IOException {
        PdfFont font= PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

        int i = 0;
        int stringWidth = 0;
        int tmp = 0;
        //when the length of the string gets close enough to the border, exits loop and returns the amount of characters that were able to fit
        while(stringWidth+110<(this.numPixelsWidth/1.33))
        {
            tmp = text.codePointAt(i);
            stringWidth = stringWidth + font.getWidth(tmp) * this.numFontSize / FontProgram.UNITS_NORMALIZATION;
            i++;
        }
        return i;
    }
    //public int characters() {

      //  return (int) (getWidth() / this.numFontSize);
   // }

    /* public int numberOfLines() {

        int lines = (int) (this.numPixelsHeight / (this.numFontSize * Constants.MULTIPLIER));
        if (lines < Constants.par.length() / temp) {
            this.numFontSize--;
        } else if (lines > Constants.par.length() / temp) {
            this.numFontSize++;
        } else {
            System.out.println(this.numFontSize);
            return this.numFontSize;
        }
        return 0;
    } */


    /***********************************************************************************************
     * Function that wraps inputText based on the amount of characters there's room for per line
     * @param inputText text being modified
     * @return String inputText with new lines
     ***********************************************************************************************/
    public String wrap(String inputText) throws IOException {

        int numCharacters = (int) getWidth(inputText);
        StringBuilder resultString = new StringBuilder();

        int i = 0;
        //Calculates where to put a new line, one line at a time.
        while (i++ < (inputText.length() / (numCharacters) + 1)) {
            int boundary = 0;
            if (inputText.length() > i * numCharacters) {
                boundary = i * numCharacters;
            }
            //On the last line, it might be too short
            else {
                boundary = (i - 1) * numCharacters + inputText.length() % numCharacters;
            }

            //If first character is a space, it gets removed
            String tmp = inputText.substring((i - 1) * numCharacters, boundary); //creates a string the length of the amount of characters that can fit in one line
            if (!tmp.isEmpty() && tmp.charAt(0)==' '){
                tmp = tmp.replaceFirst(" ", "");
            }
              String tmp2 = "";
            if (inputText.length() > i * numCharacters) {
                tmp2 = inputText.substring((i - 1) * numCharacters, boundary + 1);
            } else
            {
                tmp2=tmp;
            }
            int j = 0;
            int f = 0;
            //f counts backwards from tmp and sets j to the first space it hits
            while (j <= 0 && f <= tmp.length()) {
                f++;
                j = tmp.indexOf(' ', numCharacters - f);
            }
            String newString;
            if (!tmp2.isEmpty()&&tmp2.charAt(tmp2.length()-1)==' '||inputText.length() < i * numCharacters) {
                tmp = tmp +"\n";
                resultString.append(tmp);
            }
            else if ((double) j / numCharacters > Constants.DIVIDE) {
                newString = insertString(tmp, "\n", j);
                resultString.append(newString);
            }

            else {
                tmp = tmp + "-\n";
                resultString.append(tmp);
            }
            System.out.println(j);
        }
        return resultString.toString();
    }
}