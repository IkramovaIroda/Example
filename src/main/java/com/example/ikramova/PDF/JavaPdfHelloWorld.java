package com.example.ikramova.PDF;

    import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

    public class JavaPdfHelloWorld
    {
        public static void main(String[] args)
        {
            Document document = new Document();
            try
            {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
                document.open();
                document.add(new Paragraph("A Hello World PDF document."));
                document.add(new Paragraph("ChatGPT was launched on November 30, 2022, by San Francisco–based OpenAI, the creator of DALL. E 2 and Whisper AI. The service was launched as initially free to the public, with plans to monetize the service later. By December 4, 2022, ChatGPT already had over one million users."));
                document.close();
                writer.close();
            } catch (DocumentException e)
            {
                e.printStackTrace();
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }

