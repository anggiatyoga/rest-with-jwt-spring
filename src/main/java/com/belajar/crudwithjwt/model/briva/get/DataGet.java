package com.belajar.crudwithjwt.model.briva.get;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataGet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String BrivaNo;
    private String CustCode;
    private String nama;
    private String Keterangan;
    private String Amount;
    private String statusBayar;
    private String expiredDate;
    private String lastUpdate;

    public DataGet() {
    }

    public DataGet(String brivaNo, String custCode, String nama, String keterangan, String amount, String statusBayar, String expiredDate, String lastUpdate) {
        BrivaNo = brivaNo;
        CustCode = custCode;
        this.nama = nama;
        Keterangan = keterangan;
        Amount = amount;
        this.statusBayar = statusBayar;
        this.expiredDate = expiredDate;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrivaNo() {
        return BrivaNo;
    }

    public void setBrivaNo(String brivaNo) {
        BrivaNo = brivaNo;
    }

    public String getCustCode() {
        return CustCode;
    }

    public void setCustCode(String custCode) {
        CustCode = custCode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
