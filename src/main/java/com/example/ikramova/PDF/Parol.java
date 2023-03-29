package com.example.ikramova.PDF;
import java.io.*;
import java.net.URISyntaxException;

import com.itextpdf.text.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class Parol {
    public static void main(String[] args) throws IOException, DocumentException, URISyntaxException {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        AccessPermission accessPermission = new AccessPermission();
        accessPermission.setCanPrint(false);
        accessPermission.setCanModify(false);

        StandardProtectionPolicy standardProtectionPolicy
                = new StandardProtectionPolicy("ownerpass", "userpass", accessPermission);
        document.protect(standardProtectionPolicy);
        document.save("pdfBoxEncryption.pdf");
        document.close();

    }
}

