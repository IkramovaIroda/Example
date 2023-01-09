package com.example.ikramova.crud;


import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class AdminService
{
    @Autowired
    CsvFileRepo csvFileRepo;
    private String[] row;
    @Transactional
    public String uploadCsvFile(MultipartFile file)  {
        log.info("> uploadCsvFile");

        List<CsvFileDb> list = new ArrayList<>();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
            CSVParser parser = new CSVParserBuilder().withIgnoreQuotations(true).build();
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).withCSVParser(parser).build();
            String[] lineInArray;
            while ((lineInArray = csvReader.readNext()) != null && lineInArray.length > 1) {
                list.add(readLineInArray(lineInArray, csvReader));
            }
            reader.close();
            csvReader.close();
        } catch (CsvValidationException e) {
            log.warn("< readLineInArray getLineNumber=" + e.getLineNumber() + " getLine=" + Arrays.toString(e.getLine()));
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.info("< uploadCsvFile deleteAll");
        csvFileRepo.deleteAll();
        log.info("< uploadCsvFile saveAll");
        csvFileRepo.saveAll(list);
        log.info("< uploadCsvFile");
        return"SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL SUCCESSFUL ";
    }

    private CsvFileDb readLineInArray(String[] lineInArray, CSVReader csvReader) throws CsvValidationException, IOException {
//        log.info("> readLineInArray " + lineInArray[0]);
        CsvFileDb csvFile = new CsvFileDb();
        csvFile.setIndex(lineInArray[0]);
        csvFile.setEXTREFNO(lineInArray[2]);
        csvFile.setOrgan(lineInArray[3]);
        csvFile.setOrgan(lineInArray[4]);
        csvFile.setCustName(lineInArray[6]);
        if (lineInArray.length <= 8) {
            lineInArray = csvReader.readNext();
            if (lineInArray != null && lineInArray.length <= 14) {
                csvFile.setCustTaxId(lineInArray[8 - 6]);
                csvFile.setCustTaxId(lineInArray[12 - 8]);
                csvFile.setDob(lineInArray[13 - 7]);
                csvFile.setCustName(lineInArray[14 - 6]);
                csvFile.setBkExpdt(lineInArray[19 - 6]);
            } else {
                log.warn("< readLineInArray getLinesRead=" + csvReader.getLinesRead() + " getRecordsRead=" + csvReader.getRecordsRead());
                throw new CsvValidationException("Invalid CSV lineInArray=" + Arrays.toString(lineInArray));
            }
        } else {
            csvFile.setCustName(lineInArray[8]);
            csvFile.setCustTaxId(lineInArray[12]);
            csvFile.setDob(lineInArray[13]);
            csvFile.setListName(lineInArray[14]);
            csvFile.setBankName(lineInArray[19]);
        }
        return csvFile;
    }
}
