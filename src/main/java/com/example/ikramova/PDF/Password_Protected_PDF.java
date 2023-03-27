package com.example.ikramova.PDF;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
public class Password_Protected_PDF {

    private static String USER_PASSWORD = "password";
    private static String OWNER_PASSWORD = "lokesh";
    public static void main(String[] args) {
        try
        {
            OutputStream file = new FileOutputStream(new File("PasswordProtected.pdf"));
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, file);
            writer.setEncryption(USER_PASSWORD.getBytes(),
                    OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING,
                    PdfWriter.ENCRYPTION_AES_128);
            document.open();
            document.add(new Paragraph("Password Protected pdf example !!"));
            document.close();
            file.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
