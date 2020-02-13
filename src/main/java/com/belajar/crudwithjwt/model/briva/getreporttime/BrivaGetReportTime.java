package com.belajar.crudwithjwt.model.briva.getreporttime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class BrivaGetReportTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean status;
    private String responseDescription;
    private String responseCode;
    private ArrayList<DataGetReportTime> data;

    public BrivaGetReportTime() {
    }

    public BrivaGetReportTime(Boolean status, String responseDescription, String responseCode, ArrayList<DataGetReportTime> data) {
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

    public ArrayList<DataGetReportTime> getData() {
        return data;
    }

    public void setData(ArrayList<DataGetReportTime> data) {
        this.data = data;
    }
}
