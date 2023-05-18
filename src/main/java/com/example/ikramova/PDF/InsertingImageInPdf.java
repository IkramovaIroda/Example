package com.example.ikramova.PDF;

import java.io.File;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class InsertingImageInPdf { 
   public static void main(String args[]) throws Exception {  
      
      //Loading an existing document 
      File file = new File("C:/Users/Lenovo PC/IdeaProjects/Example/AddImageExample.pdf");
      PDDocument doc = PDDocument.load(file);


      //Retrieving the page 
      PDPage page = doc.getPage(0);
      //Creating PDImageXObject object 
      PDImageXObject pdImage = PDImageXObject.createFromFile("C:/Users/Lenovo PC/IdeaProjects/Example/печать 1.png", doc);

      //creating the PDPageContentStream object 
      PDPageContentStream contents = new PDPageContentStream(doc, page);

      //Drawing the image in the PDF document 
      contents.drawImage(pdImage, 470, 200,100,100);
      System.out.println("Image inserted");

      //Closing the PDPageContentStream object 
      contents.close();       

      //Saving the document 
      doc.save("C:/Users/Lenovo PC/IdeaProjects/Example/AddImageExample.pdf");
      
      //Closing the document  
      doc.close(); 
   }  
} 