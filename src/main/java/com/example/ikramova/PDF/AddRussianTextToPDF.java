package com.example.ikramova.PDF;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class AddRussianTextToPDF {
    public static void main(String[] args) {
        String filename = "russian-text.pdf";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.open();

            BaseFont bf = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(bf, 12);

            String text = "Привет мир!";
            Paragraph paragraph = new Paragraph(text, font);
            document.add(paragraph);

        } catch (Exception e) {
            e.printStackTrace();
        }
        document.close();
    }
}
