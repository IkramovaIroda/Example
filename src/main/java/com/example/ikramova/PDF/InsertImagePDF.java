package com.example.ikramova.PDF;

import java.io.*;

// importing itext library packages
import com.itextpdf.io.image.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPCell;

public class InsertImagePDF {
	public static void main(String[] args)
		throws IOException
	{
		String currDir = System.getProperty("user.dir");
		String pdfPath = currDir + "/AddImageExample.pdf";
		
		PdfWriter writer = new PdfWriter(pdfPath);
		

		PdfDocument pdfDoc = new PdfDocument(writer);
		
		Document doc = new Document(pdfDoc);

		ImageData imageData = ImageDataFactory.create(
			currDir + "/печать 1.png");

		Image img = new Image(imageData);
		img.setWidth(100);
		img.setHeight(100);
		doc.add(img);


		Text text1 = new Text("Hi I'm Mayank Tyagi");

		Paragraph para1 = new Paragraph(text1);

		Text text2 = new Text(
				"I'm a technical content writer at GeeksforGeeks");

		Paragraph para2 = new Paragraph(text2);
		doc.add(para1);
		doc.add(para2);

		Table table = new Table(6);
		table.setWidth(100);
		table.setSpacingRatio(10f);
		for (int i = 0; i <15; i++) {
			table.addCell("Name");
			table.addCell("Raju");
			table.addCell("Id");
			table.addCell("1001");
			table.addCell("Designation");
			table.addCell("Programmer");
			table.setHeight(30);
			table.setWidth(60);
			doc.add(table);
		}
		doc.close();
		
		System.out.println(
			"Image added successfully and PDF file created!");
	}
}
