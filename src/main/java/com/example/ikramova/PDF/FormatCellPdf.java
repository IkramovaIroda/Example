package com.example.ikramova.PDF;// Java Program to format the content
// of a cell in a table of PDF

// Importing generic java libraries
import java.io.*;

// Importing itext library packages
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.*;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.properties.TextAlignment;

public class FormatCellPdf {

	public static void main(String args[]) throws Exception
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


			Text text1 = new Text("История счета карты в системе ПК SmartVista (Номер карты: 8600500448286654 Xusan Ogli Gaybullaxon Xashimov)\t\t\t\t\n");

			Paragraph para1 = new Paragraph(text1);

			Text text2 = new Text(
					"за период с 01.03.2023 по 10.04.2023\t\n");

			Paragraph para2 = new Paragraph(text2);
			doc.add(para1).setItalic();
			doc.add(para2).setItalic();

            doc.setFontSize(8);
		float[] columnWidhts = { 10F, 10F,10F,10F, 10F,10F,10F,10F };
		Table table = new Table(columnWidhts);
		for (int i = 0; i < 3; i++) {
			Cell cell1 = new Cell();
			cell1.add(new Paragraph("Ирода"));
			cell1.setTextAlignment(TextAlignment.CENTER);
			Cell cell2 = new Cell();
			cell2.add(new Paragraph("Blackikuyjhgtrf trf"));
			cell2.setTextAlignment(TextAlignment.CENTER);
			Cell cell3 = new Cell();
			cell3.add(new Paragraph("Colorp;olikujyh gfd"));
			cell3.setTextAlignment(TextAlignment.CENTER);
			Cell cell4 = new Cell();
			cell4.add(new Paragraph("oliloikujhygtrf hygtrf"));
			cell4.setTextAlignment(TextAlignment.CENTER);
			Cell cell5 = new Cell();
			cell5.add(new Paragraph("Colorikujyhgtrf htgrf"));
			cell5.setTextAlignment(TextAlignment.CENTER);
			Cell cell6 = new Cell();
			cell6.add(new Paragraph("Yellowp;olikuyjgtrf hgtrf"));
			cell6.setTextAlignment(TextAlignment.CENTER);

			Cell cell7 = new Cell();
			cell7.add(new Paragraph("Yellowp;olikuyjgtrf hgtrf"));
			cell7.setTextAlignment(TextAlignment.CENTER);
			Cell cell8= new Cell();
			cell8.add(new Paragraph("Yellowp;olikuyjgtrf hgtrf"));
			cell8.setTextAlignment(TextAlignment.CENTER);
			table.addCell(cell1);
			table.addCell(cell2);
			table.addCell(cell3);
			table.addCell(cell4);
			table.addCell(cell5);
			table.addCell(cell6);
			table.addCell(cell7);
			table.addCell(cell8);
			doc.add(table);
		}
		doc.close();
		System.out.println("Table created successfully!");
	}
}
