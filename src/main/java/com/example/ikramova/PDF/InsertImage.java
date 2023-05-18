//package com.example.ikramova.PDF;
//
//import com.spire.pdf.*;
//import com.spire.pdf.graphics.PdfImage;
//
//public class InsertImage {
//    public static void main(String[] args) {
//
//        //Create PDF document
//        PdfDocument pdf = new PdfDocument();
//
//        //Load the PDF document from disk
//        pdf.loadFromFile("D:\\Files\\input.pdf");
//
//        //Get a specified page
//        PdfPageBase page = pdf.getPages().get(0);
//
//        //Load an image
//        PdfImage image = PdfImage.fromFile("C:\\Users\\Administrator\\Desktop\\Olympics.jpg");
//
//        //Set the width and height of image
//        float width = image.getWidth() * 0.75f;
//        float height = image.getHeight() * 0.75f;
//
//        //Define a position to draw image
//        double x = (page.getCanvas().getClientSize().getWidth()-width) /2;
//        float y = 300f;
//
//        //Set image transparency
//        page.getCanvas().setTransparency(0.5f);
//
//        //Draw image on page canvas
//        page.getCanvas().drawImage(image, x, y, width, height);
//
//        //Save the document
//        pdf.saveToFile("insertImage.pdf", FileFormat.PDF);
//        pdf.close();
//    }
//}