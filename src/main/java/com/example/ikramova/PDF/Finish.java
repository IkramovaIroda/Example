package com.example.ikramova.PDF;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.properties.TextAlignment;

import java.io.IOException;

public class Finish {
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


        Text text1 = new Text("История счета карты в системе ПК SmartVista (Номер карты: 8600500448286654 Xusan Ogli Gaybullaxon Xashimov)\t\t\t\t\n");

        Paragraph para1 = new Paragraph(text1);

        Text text2 = new Text(
                "за период с 01.03.2023 по 10.04.2023\t\n");

        Paragraph para2 = new Paragraph(text2);
        doc.add(para1).setItalic();
        doc.add(para2).setItalic();
        float[] columnWidhts = { 500F, 500F, 500F, 500F, 500F, 500F, 500F, 500F};
        Table table = new Table(columnWidhts);
        for (int i = 0; i <3 ; i++) {

            Cell cell1 = new Cell();
            cell1.add(new Paragraph("Дата проведения"));
            cell1.setTextAlignment(TextAlignment.CENTER);
            cell1.setWidth(10);
            cell1.setHeight(10);
            Cell cell2 = new Cell();
            cell2.add(new Paragraph("Время проведения"));
            cell2.setTextAlignment(TextAlignment.CENTER);
            cell2.setWidth(10);
            cell2.setHeight(10);
            Cell cell3 = new Cell();
            cell3.add(new Paragraph("Дата обработки"));
            cell3.setTextAlignment(TextAlignment.CENTER);
            cell3.setWidth(10);
            cell3.setHeight(10);
            Cell cell4 = new Cell();
            cell4.add(new Paragraph("Код операции"));
            cell4.setTextAlignment(TextAlignment.CENTER);
            cell4.setWidth(10);
            cell4.setHeight(10);
            Cell cell5 = new Cell();
            cell5.add(new Paragraph("Сумма"));
            cell5.setTextAlignment(TextAlignment.CENTER);
            cell5.setWidth(10);
            cell5.setHeight(10);
            Cell cell6 = new Cell();
            cell6.add(new Paragraph("Счет карты"));
            cell6.setTextAlignment(TextAlignment.CENTER);
            cell6.setWidth(10);
            cell6.setHeight(10);
            Cell cell7 = new Cell();
            cell7.add(new Paragraph("Банк исполнителя"));
            cell7.setTextAlignment(TextAlignment.CENTER);
            cell7.setWidth(10);
            cell7.setHeight(10);
            Cell cell8 = new Cell();
            cell8.add(new Paragraph("Наименование торговой точки"));
            cell8.setTextAlignment(TextAlignment.CENTER);
            cell8.setWidth(10);
            cell8.setHeight(10);
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

        System.out.println(
                "Image added successfully and PDF file created!");
    }
}
