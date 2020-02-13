package com.belajar.crudwithjwt.model.briva.updatestatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class BrivaUpdateStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean status;
    private String responseDescription;
    private String responseCode;
    private ArrayList<DataUpdateStatus> data;

    public BrivaUpdateStatus() {
    }

    public BrivaUpdateStatus(Boolean status, String responseDescription, String responseCode, ArrayList<DataUpdateStatus> data) {
        this.status = status;
        this.responseDescription = responseDescription;
        this.responseCode = responseCode;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public ArrayList<DataUpdateStatus> getData() {
        return data;
    }

    public void setData(ArrayList<DataUpdateStatus> data) {
        this.data = data;
    }
}
