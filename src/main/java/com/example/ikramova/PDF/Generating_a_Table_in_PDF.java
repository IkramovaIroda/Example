package com.example.ikramova.PDF;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Generating_a_Table_in_PDF {
    public static void main(String[] args)
    {
        Document document = new Document();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddTableExample.pdf"));
            document.open();

            String currDir = System.getProperty("user.dir");
            ImageData imageData = ImageDataFactory.create(
                    currDir + "/печать 1.png");
            com.itextpdf.layout.element.Image img = new com.itextpdf.layout.element.Image(imageData);
            img.setPadding(23);





            Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
            Paragraph paragraph = new Paragraph("                       Hello World                   ", font);
            document.add(paragraph);
            PdfPTable table = new PdfPTable(6); // 3 columns.
            table.setWidthPercentage(100); //Width 100%
            table.setSpacingBefore(10f); //Space before table
            table.setSpacingAfter(10f); //Space after table
            //Set Column widths
            float[] columnWidths = {1f, 1f, 1f,1f,1f,1f};
            table.setWidths(columnWidths);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Cell1"));
           // cell1.setBorderColor(BaseColor.BLACK);
            cell1.setPaddingLeft(10);
            cell1.setPaddingRight(10);
          //  cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
         //   cell2.setBorderColor(BaseColor.BLACK);
            cell2.setPaddingLeft(10);
          //  cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
          //  cell3.setBorderColor(BaseColor.BLACK);
            cell3.setPaddingLeft(10);
          //  cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);
            PdfPCell cell1s = new PdfPCell(new Paragraph("Cell 1"));
           // cell1s.setBorderColor(BaseColor.BLACK);
            cell1s.setPaddingLeft(10);
       //     cell1s.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1s.setVerticalAlignment(Element.ALIGN_MIDDLE);
            PdfPCell cell2s = new PdfPCell(new Paragraph("Cell 2"));
          //  cell2s.setBorderColor(BaseColor.BLACK);
            cell2s.setPaddingLeft(10);
          //  cell2s.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2s.setVerticalAlignment(Element.ALIGN_MIDDLE);
            PdfPCell cell3s = new PdfPCell(new Paragraph("Cell 3"));
          //  cell3s.setBorderColor(BaseColor.BLACK);
            cell3s.setPaddingLeft(10);
            //cell3s.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3s.setVerticalAlignment(Element.ALIGN_MIDDLE);
            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);

            for (int i = 0; i < 14; i++) {
                table.addCell(cell1s);
                table.addCell(cell2s);
                table.addCell(cell3s);
                table.addCell(cell1);
                table.addCell(cell2);
                table.addCell(cell3);
            }
            document.add(table);
            document.close();
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
