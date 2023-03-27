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
public class Creating_PDF_with_Limited_Permissions {
//    PdfWriter.ALLOW_PRINTING
//    PdfWriter.ALLOW_ASSEMBLY
//    PdfWriter.ALLOW_COPY
//    PdfWriter.ALLOW_DEGRADED_PRINTING
//    PdfWriter.ALLOW_FILL_IN
//    PdfWriter.ALLOW_MODIFY_ANNOTATIONS
//    PdfWriter.ALLOW_MODIFY_CONTENTS
//    PdfWriter.ALLOW_SCREENREADERS

    public static void main(String[] args) {
        try {
            OutputStream file = new FileOutputStream(new File(
                    "LimitedAccess.pdf"));
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, file);
            writer.setEncryption("".getBytes(), "".getBytes(),
                    PdfWriter.ALLOW_PRINTING , //Only printing allowed; Try to copy text !!
                    PdfWriter.ENCRYPTION_AES_128);
            document.open();
            document.add(new Paragraph("Limited Access File !!"));
            document.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
