//package com.example.ikramova.PDF;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.net.URL;
//import java.util.Date;
//
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.CMYKColor;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//public class Writing_PDF_to_HttpOutputStream {
//    public static void main(String[] args) {
//        Document document = new Document();
//        try{
//            response.setContentType("application/pdf");
//            PdfWriter.getInstance(document, response.getOutputStream());
//            document.open();
//            document.add(new Paragraph("howtodoinjava.com"));
//            document.add(new Paragraph(new Date().toString()));
//            //Add more content here
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        document.close();
//    }
//    }
////}
