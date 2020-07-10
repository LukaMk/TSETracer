package com.Ideabytes;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;

import java.io.File;


public class MakeField {

        public static final String DEST = "C:\\Users\\Luka\\Documents\\ItextOutput\\makebox.pdf";

        public static void makeBox() throws Exception {
            File file = new File(DEST);
            file.getParentFile().mkdirs();

            //new MakeField().manipulatePdf(DEST);
        }


    }






