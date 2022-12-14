package com.example.ikramova.crud;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
@Log4j2
public class AdminService
{
    @Autowired
    CsvFileRepo csvFileRepo;
    private String[] row;
    public CsvFile uploadCsvFile(String path){
        log.info("> uploadCsvFile");
        String line = "";
        String splitBy = ",,";
        CsvFile csvFile = new CsvFile();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
//            while ((line = br.readLine()) != null)
//            {
//                row=(line.split(splitBy));
//
//                log.info("< uploadCsvFile");
//
//            }
            for (int i = 0; i < 3; i++) {

                line = br.readLine();
                row=(line.split(splitBy));
               csvFile.setUrefNo(row[0]);
               csvFile.setBankCode(row[1]);
               csvFile.setBankName(row[2]);
               csvFile.setTitle(row[3]);
               csvFile.setCustType(row[4]);
               csvFile.setCustUid(row[5]);
               csvFile.setCustTaxId(row[7]);
               csvFileRepo.save(csvFile);
            }

        } catch (IOException e) {
            log.info("< uploadCsvFile"+e.getMessage());
            e.printStackTrace();
        }
        log.info("< uploadCsvFile");
         csvFileRepo.deleteAll();
        return csvFile;
    }
}
