package com.belajar.crudwithjwt.model.briva.updatestatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataUpdateStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String institutionCode;
    private String brivaNo;
    private String custCode;
    private String statusBayar;

    public DataUpdateStatus() {
    }

    public DataUpdateStatus(String institutionCode, String brivaNo, String custCode, String statusBayar) {
        this.institutionCode = institutionCode;
        this.brivaNo = brivaNo;
        this.custCode = custCode;
        this.statusBayar = statusBayar;
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

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }
}
