package com.example.ikramova.crud;


import com.example.ikramova.crud.AdminService;
import lombok.extern.log4j.Log4j2;
import org.h2.tools.Csv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Arrays;

@RestController
@RequestMapping("/admin")
@Log4j2
public class Controller {
@Autowired
AdminService adminService;
    @PostMapping(value = "uploadCsvFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Object uploadFile( @RequestParam("file") MultipartFile file) {
        log.info("<< uploadCsvFile");
        try {
            return  adminService.uploadCsvFile(file);
        } catch (Exception e) {
            log.error("Unexpected error " + e.getMessage(), e);
            return e.getMessage();
        }
    }
}







