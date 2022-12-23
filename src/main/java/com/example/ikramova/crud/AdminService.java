package com.example.ikramova.crud;


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
@Log4j2
public class AdminService
{
    @Autowired
    CsvFileRepo csvFileRepo;
    private String[] row;
    public String uploadCsvFile(MultipartFile file)  {
        log.info(">> uploadCsvFile");

       if(csvFileRepo.findAll()!=null) {
           csvFileRepo.deleteAll();
       }
        Reader reader = null;
        try {
            reader = new InputStreamReader(file.getInputStream());
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            String[] lineInArray;
            while ((lineInArray = csvReader.readNext()) != null) {
                CsvFileDb csvFile = new CsvFileDb();
                csvFile.setIndex(lineInArray[0]);
                csvFile.setEXTREFNO(lineInArray[2]);
                csvFile.setListName(lineInArray[3]);
                csvFile.setOrgan(lineInArray[4]);
                csvFile.setCustName(lineInArray[6]);
                csvFile.setBankName(lineInArray[8]);
                csvFile.setCustTaxId(lineInArray[12]);
                csvFile.setDob(lineInArray[13]);
                csvFile.setAddress1(lineInArray[14]);
                csvFile.setBkExpdt(lineInArray[19]);
                csvFileRepo.save(csvFile);
            }

        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        log.info("<< uploadCsvFile");
        return "succes";
    }
}
