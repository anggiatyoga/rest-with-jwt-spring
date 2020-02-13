package com.belajar.crudwithjwt.model.briva.getreporttime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataGetReportTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brivaNo;
    private String custCode;
    private String nama;
    private String keterangan;
    private String amount;
    private String paymentDate;
    private String tellerid;
    private String no_rek;

    public DataGetReportTime() {
    }

    public DataGetReportTime(String brivaNo, String custCode, String nama, String keterangan, String amount, String paymentDate, String tellerid, String no_rek) {
        this.brivaNo = brivaNo;
        this.custCode = custCode;
        this.nama = nama;
        this.keterangan = keterangan;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.tellerid = tellerid;
        this.no_rek = no_rek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTellerid() {
        return tellerid;
    }

    public void setTellerid(String tellerid) {
        this.tellerid = tellerid;
    }

    public String getNo_rek() {
        return no_rek;
    }

    public void setNo_rek(String no_rek) {
        this.no_rek = no_rek;
    }
}
