package com.example.ikramova.crud;

import javax.persistence.*;

import lombok.*;
import org.springframework.stereotype.Indexed;

import javax.persistence.Table;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "csv_file")
@ToString
public class CsvFile {
    @Id
    @Column(name = "uref_no")
    private String urefNo;


//    @Column(name = "national_id")
//    private Long nationalId;

//    @Column(name = "seq_no")
//    private Long seqNo;

//    @Column(name = "extref_no")
//    private Long extrefNo;

    @Column(name = "bank_code")
    private String bankCode;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "title")
    private String title;

    @Column(name = "cust_type")
    private String custType;

    @Column(name = "cust_uid")
    private String custUid;
    @Column(name = "cust_tax_id")
    private String custTaxId;

//    @Column(name = "cust_dob")
//    private String custDob;

//
//    @Column(name = "address1")
//    private String address1;
//
//    @Column(name = "address2")
//    private String address2;
//
//    @Column(name = "address3")
//    private String address3;
//
//    @Column(name = "address4")
//    private String address4;
//
//    @Column(name = "province")
//    private String province;
//
//    @Column(name = "post_code")
//    private String postCode;
//
//    @Column(name = "post_desc")
//    private String postDesc;
//
//    @Column(name = "bk_effdt")
//    private String bkEffdt;
//
//
//    @Column(name = "bk_expdt")
//    private String bkExpdt;
//
//    @Column(name = "cust_account")
//    private String custAccount;
//
//    @Column(name = "account_type")
//    private String accountType;
//
//    @Column(name = "customer_no")
//    private String customerNo;
//
//    @Column(name = "cust_name")
//    private String custName;
//
//    @Column(name = "remarks")
//    private String remarks;
//
//    @Column(name = "upseq")
//    private String upseq;

}
