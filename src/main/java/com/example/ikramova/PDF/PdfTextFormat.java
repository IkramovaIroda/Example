package com.example.ikramova.PDF;// Java program to Format the Text in a PDF


import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

public class PdfTextFormat {
	public static void main(String args[]) throws Exception
	{
		String file
			= "C:/Users/Lenovo PC/IdeaProjects/Example/AddTableExample.pdf";

		// Creating a PdfDocument object
		PdfDocument pdfDoc
			= new PdfDocument(new PdfWriter(file));

		// Creating a Document object
		Document doc = new Document(pdfDoc);

		// Adding text to the document
		Text text1 = new Text("Hi I'm Mayank Tyagi");

		// Creating a paragraph 1
		Paragraph para1 = new Paragraph(text1);

		Text text2 = new Text(
			"I'm a technical content writer at GeeksforGeeks");

	// In version 7.2.x the above line may be replaced by
	// text2.setFontColor(ColorConstants.BLACK);/*com.itextpdf.kernel.colors.ColorConstants*/



		// Creating a paragraph 2
		Paragraph para2 = new Paragraph(text2);

		// Adding paragraphs to the document
		doc.add(para1);
		doc.add(para2);

		// Closing the document
		doc.close();
		System.out.println("Text added successfully..");
	}
}
