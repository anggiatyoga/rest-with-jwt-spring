package com.belajar.crudwithjwt.exceptions;

import com.belajar.crudwithjwt.model.RegisterUser;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -7806029002430564887L;
    private String msg;
    private String status;
//    private String data;
    private ArrayList<RegisterUser> dataList;
    private List<String> userData;

    public ValidationException(String msg) {
        this.msg = msg;
    }

    public ValidationException(String msg, String status, ArrayList<RegisterUser> dataList) {
        this.msg = msg;
        this.status = status;
        this.dataList = dataList;
    }

    public ValidationException(String msg, String status, List<String> userData) {
        this.msg = msg;
        this.status = status;
        this.userData = userData;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<RegisterUser> getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList<RegisterUser> dataList) {
        this.dataList = dataList;
    }
}
