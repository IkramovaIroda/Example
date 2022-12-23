package com.example.ikramova.crud;


import com.example.ikramova.crud.CsvFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CsvFileRepo extends JpaRepository<CsvFileDb, String> {

}
