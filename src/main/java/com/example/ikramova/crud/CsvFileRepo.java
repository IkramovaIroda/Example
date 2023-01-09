package com.example.ikramova.crud;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CsvFileRepo extends JpaRepository<CsvFileDb, String> {
       List<CsvFileDb> findByIndex( String index);
}
