package com.example.ikramova.PDF;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
public class Creating_List_of_Items_in_PDF {
    public static void main(String[] args) {
        Document document = new Document();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ListExample.pdf"));
            document.open();
            document.add(new Paragraph("List Example"));
            //Add ordered list
            List orderedList = new List(List.ORDERED);
            orderedList.add(new ListItem("Item 1"));
            orderedList.add(new ListItem("Item 2"));
            orderedList.add(new ListItem("Item 3"));
            document.add(orderedList);
            //Add un-ordered list
            List unorderedList = new List(List.UNORDERED);
            unorderedList.add(new ListItem("Item 1"));
            unorderedList.add(new ListItem("Item 2"));
            unorderedList.add(new ListItem("Item 3"));
            document.add(unorderedList);
            //Add roman list
            RomanList romanList = new RomanList();
            romanList.add(new ListItem("Item 1"));
            romanList.add(new ListItem("Item 2"));
            romanList.add(new ListItem("Item 3"));
            document.add(romanList);
            //Add Greek list
            GreekList greekList = new GreekList();
            greekList.add(new ListItem("Item 1"));
            greekList.add(new ListItem("Item 2"));
            greekList.add(new ListItem("Item 3"));
            document.add(greekList);
            //ZapfDingbatsList List Example
            ZapfDingbatsList zapfDingbatsList = new ZapfDingbatsList(43, 30);
            zapfDingbatsList.add(new ListItem("Item 1"));
            zapfDingbatsList.add(new ListItem("Item 2"));
            zapfDingbatsList.add(new ListItem("Item 3"));
            document.add(zapfDingbatsList);
            //List and Sublist Examples
            List nestedList = new List(List.UNORDERED);
            nestedList.add(new ListItem("Item 1"));
            List sublist = new List(true, false, 30);
            sublist.setListSymbol(new Chunk("", FontFactory.getFont(FontFactory.HELVETICA, 6)));
            sublist.add("A");
            sublist.add("B");
            nestedList.add(sublist);
            nestedList.add(new ListItem("Item 2"));
            sublist = new List(true, false, 30);
            sublist.setListSymbol(new Chunk("", FontFactory.getFont(FontFactory.HELVETICA, 6)));
            sublist.add("C");
            sublist.add("D");
            nestedList.add(sublist);
            document.add(nestedList);
            document.close();
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
