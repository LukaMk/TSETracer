package com.Ideabytes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private int numFontSize;
    private int lineNum;
    private Map<Integer, String> lineRemainder;
    List<String> stringArray;
    //private String enteredText;

    //Constructor
    public WrapText(int a, int c) {
        this.numPixelsWidth = a;
        this.numFontSize = c;
        this.lineRemainder = new HashMap<>();
        this.stringArray = new ArrayList<String>();
    }
    //determines the amount of characters would fit in the given space

    public String insertString(String firstString,String inputString, int index) {
        String newString = "";
        for (int f = 0; f < firstString.length(); f++) {

            // Insert the original string character
            // into the new string
            newString += firstString.charAt(f);

            if (f == index) {
                newString=newString+inputString;
                lineRemainder.put(lineNum, firstString.substring(index));
                return newString;

            }
        }
        return newString;

    }

    public int characters() {
        return (int) (this.numPixelsWidth / this.numFontSize );//* Constants.MULTIPLIER);
    }


    public List<String> wrapAll(String inputString) {
        String display = "";
        int i=0;
        while (i++ < (display.length() * characters() + 1)) {
            setLineNum(i);
            display = wrap(inputString);
            stringArray.add(display);
        }
        return stringArray;
    }
    //Function that wraps inputText based on the amount of characters there's room for per line
    /* @param String inputText text being modified
     * @return String inputText broken into lines with limited number of characters
     */
    public String wrap(String inputText) {
        int numCharacters = characters();
        //Calculates where to put a new line, one line at a time.
            if (this.lineNum < (inputText.length() / (numCharacters) + 2)) {
            int boundary;
            if (inputText.length() > this.lineNum * numCharacters) {
                boundary = this.lineNum * numCharacters;
            }
            //On the last line, it might be too short
            else {
                boundary = (this.lineNum - 1) * numCharacters + inputText.length() % numCharacters;
            }

            //Finds line from input string

            String tmp = inputText.substring((this.lineNum - 1) * numCharacters, boundary);
            /*if (tmp.charAt(0) == ' ') {
                tmp = tmp.replaceFirst(" ", "");
            }
            if (lineRemainder.get(lineNum - 1) != null && lineRemainder.get(lineNum - 1).charAt(0) == ' ') {
                String replacement = lineRemainder.get(lineNum - 1);
                replacement = replacement.replaceFirst(" ", "");
                lineRemainder.replace(lineNum - 1, replacement);
            }
            */

            int j = 0;
            int f = 0;
            while (j <= 0 && f <= tmp.length()) {
                f++;
                j = tmp.indexOf(' ', numCharacters - f);

            }
            String newString;

            System.out.println(j);
            if (tmp.charAt(tmp.length() - 1) == ' ' || inputText.length() < this.lineNum * numCharacters) {
                if (lineRemainder.get(lineNum - 1) != null) {
                    tmp = lineRemainder.get(lineNum - 1) + tmp+"\n";
                }
                return tmp;
            } else if ((double) j / numCharacters > Constants.DIVIDE) {
                newString = insertString(tmp,"\n", j);
                if (lineRemainder.get(lineNum - 1) != null) {
                    newString = lineRemainder.get(lineNum - 1) + newString;
                }

                return newString;
            } else {
                //tmp = lineRemainder.get(lineNum-1) + tmp;
                if (lineRemainder.get(lineNum - 1) != null) {
                    tmp = lineRemainder.get(lineNum - 1) + tmp;
                }
                tmp = tmp + "-\n";
                return tmp;
            }


        }

        return "";
    }

    public void setLineNum(int inLineNum) {
        this.lineNum = inLineNum;
    }

}
