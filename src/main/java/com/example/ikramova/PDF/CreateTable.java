//package com.example.ikramova.PDF;
//
//import com.spire.data.table.DataTable;
//
//import com.spire.pdf.PdfDocument;
//
//import com.spire.pdf.PdfPageBase;
//
//import com.spire.pdf.PdfPageSize;
//
//import com.spire.pdf.graphics.*;
//
//import com.spire.pdf.tables.*;
//
//
//
//import java.awt.*;
//
//import java.awt.geom.Point2D;
//
//
//
//public class CreateTable {
//
//    public static void main(String[] args) {
//
//        PdfDocument doc = new PdfDocument();
//
//        PdfPageBase page = doc.getPages().add(PdfPageSize.A4, new PdfMargins(40));
//
//
//
//        //Create a PdfTable object
//
//        PdfTable table = new PdfTable();
//
//        //Set font for header and the rest cells
//
//        table.getStyle().getDefaultStyle().setFont(new PdfTrueTypeFont(new Font("Times New Roman", Font.PLAIN, 12), true));
//
//        table.getStyle().getHeaderStyle().setFont(new PdfTrueTypeFont(new Font("Times New Roman", Font.BOLD, 12), true));
//
//
//
//        //Define data
//String[] data = {"ID;Name;Department;Position;Level",
//
//                "1; David; IT; Manager; 1",
//
//                "3; Julia; HR; Manager; 1",
//
//                "4; Sophie; Marketing; Manager; 1",
//
//                "7; Wickey; Marketing; Sales Rep; 2",
//
//                "9; Wayne; HR; HR Supervisor; 2",
//
//                "11; Mia; Dev; Developer; 2"};
//
//        String[][] dataSource = new String[data.length][];
//
//        for (int i = 0; i < data.length; i++) {
//
//            dataSource[i] = data[i].split("[;]", -1);
//
//        }
//
//        //Set data as the table data
//
//        table.setDataSource(dataSource);
//
//
//
//        //Set the first row as header row
//
//        table.getStyle().setHeaderSource(PdfHeaderSource.Rows);
//
//        table.getStyle().setHeaderRowCount(1);
//
//
//
//        //Show header(the header is hidden by default)
//
//        table.getStyle().setShowHeader(true);
//
//
//
//        //Set font color and background color of header row
//
//        table.getStyle().getHeaderStyle().setBackgroundBrush(PdfBrushes.getGray());
//
//        table.getStyle().getHeaderStyle().setTextBrush(PdfBrushes.getWhite());
//
//
//
//        //Set text alignment in header row
//
//        table.getStyle().getHeaderStyle().setStringFormat(new PdfStringFormat(PdfTextAlignment.Center, PdfVerticalAlignment.Middle));
//
//
//
//        //Set text alignment in other cells
//
//        for (int i = 0; i < table.getColumns().getCount(); i++) {
//
//            table.getColumns().get(i).setStringFormat(new PdfStringFormat(PdfTextAlignment.Center, PdfVerticalAlignment.Middle));
//
//        }
//
//
//
//        //Register with BeginRowLayout event
//
//        table.beginRowLayout.add(new BeginRowLayoutEventHandler() {
//
//
//
//            public void invoke(Object sender, BeginRowLayoutEventArgs args) {
//
//                Table_BeginRowLayout(sender, args);
//
//
//
//            }
//
//        });
//
//        table.draw(page, new Point2D.Float(0, 30));
//
//        //Save the document to a PDF file
//
//        doc.saveToFile("output/PdfTable.pdf");
//
//
//
//    }
//
//
//
//    //Event handler
//
//    private static void Table_BeginRowLayout(Object sender, BeginRowLayoutEventArgs args) {
//
//
//
//        //Set row height
//
//        args.setMinimalHeight(20f);
//
//
//
//        //Alternate color of rows except the header row
//
//        if (args.getRowIndex() == 0) {
//
//            return;
//
//        }
//
//        if (args.getRowIndex() % 2 == 0) {
//
//            args.getCellStyle().setBackgroundBrush(PdfBrushes.getLightGray());
//
//        } else {
//
//            args.getCellStyle().setBackgroundBrush(PdfBrushes.getWhite());
//
//        }
//
//    }
//
//}
