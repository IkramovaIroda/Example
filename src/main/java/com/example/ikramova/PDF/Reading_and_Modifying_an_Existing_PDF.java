//package com.example.ikramova.PDF;
//import java.io.*;
//import java.net.URL;
//import java.io.FileOutputStream;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.*;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
//public class Reading_and_Modifying_an_Existing_PDF {
//    public static void main(String[] args) {
//        try
//        {
//            //Read file using PdfReader
//            PdfReader pdfReader = new PdfReader("HelloWorld.pdf");
//            //Modify file using PdfReader
//            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("HelloWorld-modified.pdf"));
//            Image image = Image.getInstance("temp.jpg");
//            image.scaleAbsolute(100, 50);
//            image.setAbsolutePosition(100f, 700f);
//            for(int i = 1; i&lt;= pdfReader.getNumberOfPages(); i++)
//            {
//                PdfContentByte content = pdfStamper.getUnderContent(i);
//                content.addImage(image);
//            }
//            pdfStamper.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//    }
//}
