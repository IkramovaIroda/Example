package com.example.ikramova.PDF;// Adding table in a pdf using java
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

public class AddingTableToPDF {
	public static void main(String args[]) throws Exception
	{
		String file
			= "C:/Users/Lenovo PC/IdeaProjects/Example/AddTableExample.pdf";

		// Step-1 Creating a PdfDocument object
		PdfDocument pdfDoc
			= new PdfDocument(new PdfWriter(file));

		// Step-2 Creating a Document object
		Document doc = new Document(pdfDoc);

		// Step-3 Creating a table
		Table table = new Table(6);

		// Step-4 Adding cells to the table
		table.addCell("Name");
		table.addCell("Raju");
		table.addCell("Id");
		table.addCell("1001");
		table.addCell("Designation");
		table.addCell("Programmer");

		// Step-6 Adding Table to document
		doc.add(table);

		// Step-7 Closing the document
		doc.close();
		System.out.println("Table created successfully..");
	}
}
