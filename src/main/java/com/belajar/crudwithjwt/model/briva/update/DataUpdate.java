package com.belajar.crudwithjwt.model.briva.update;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String institutionCode;
    private String brivaNo;
    private String custCode;
    private String nama;
    private String amount;
    private String keterangan;
    private String expiredDate;

    public DataUpdate() {
    }

    public DataUpdate(String institutionCode, String brivaNo, String custCode, String nama, String amount, String keterangan, String expiredDate) {
        this.institutionCode = institutionCode;
        this.brivaNo = brivaNo;
        this.custCode = custCode;
        this.nama = nama;
        this.amount = amount;
        this.keterangan = keterangan;
        this.expiredDate = expiredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getBrivaNo() {
        return brivaNo;
    }

    public void setBrivaNo(String brivaNo) {
        this.brivaNo = brivaNo;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
}
