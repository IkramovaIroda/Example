package com.example.ikramova.crudCsvFile;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "csv_fileDb")
@ToString
public class CsvFileDb {
    @Id
    @Column(name = "index", nullable = false)
    private String index;

    @Column(name = "EXTREFNO")
    private String EXTREFNO;

    @Column(name = "LIST_NAME")
    private String listName;

    @Column(name = "ORGAN")
    private String organ;

    @Column(name = "CUST_NAME")
    private String custName;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "CUST_TAX_ID")
    private String custTaxId;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "BK_EXPDT")
    private String bkExpdt;
}
