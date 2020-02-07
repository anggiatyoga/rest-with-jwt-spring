package com.belajar.crudwithjwt.model.mynt;

import java.util.ArrayList;

public class MemberModel {

    private String status;
    private String code;
    private String message;
    private ArrayList<DataModel> data;

    public MemberModel(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public MemberModel(String status, String code, String message, ArrayList<DataModel> data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<DataModel> getData() {
        return data;
    }

    public void setData(ArrayList<DataModel> data) {
        this.data = data;
    }
}
