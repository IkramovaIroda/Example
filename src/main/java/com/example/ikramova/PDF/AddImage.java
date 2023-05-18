package com.example.ikramova.PDF;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class AddImage {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("sample.pdf"));
            document.open();
            Image img = Image.getInstance("печать 1.png");
            img.scaleToFit(100f, 100f);
            document.add(img);
            document.close();
            System.out.println("That's it");
        } catch (Exception e) {
            System.err.println("Exception : " + e);
        }
    }
}
