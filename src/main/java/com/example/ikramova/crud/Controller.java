package com.example.ikramova.crud;


import com.example.ikramova.crud.AdminService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/admin")
@Log4j2
public class Controller {
@Autowired
AdminService adminService;
    private boolean canRead;
    @GetMapping("/uploadCsvFile")
    public Object uploadFile(File file) {
        log.info("<< uploadCsvFile");
        try {
            String  path="C:\\Users\\Lenovo PC\\IdeaProjects\\IKRAMOVA\\CBBLKUPLD.csv";
            canRead = file.canRead();
            return  adminService.uploadCsvFile(path);
        } catch (Exception e) {
            log.error("Unexpected error " + e.getMessage(), e);
            return e.getMessage();
        }
    }
}







