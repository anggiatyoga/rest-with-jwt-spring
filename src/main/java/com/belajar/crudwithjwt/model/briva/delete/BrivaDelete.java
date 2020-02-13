package com.belajar.crudwithjwt.model.briva.delete;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class BrivaDelete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean status;
    private String responseDescription;
    private String responseCode;
    private ArrayList<DataDelete> data;

    public BrivaDelete() {
    }

    public BrivaDelete(Boolean status, String responseDescription, String responseCode, ArrayList<DataDelete> data) {
        this.status = status;
        this.responseDescription = responseDescription;
        this.responseCode = responseCode;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<DataDelete> getData() {
        return data;
    }

    public void setData(ArrayList<DataDelete> data) {
        this.data = data;
    }
}
