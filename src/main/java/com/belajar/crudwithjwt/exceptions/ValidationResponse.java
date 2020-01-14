package com.belajar.crudwithjwt.exceptions;

import com.belajar.crudwithjwt.model.RegisterUser;

public class ValidationResponse {
    private String status;
    private String message;
//    private String data;
    private RegisterUser dataList;

//    public ValidationResponse() {
//    }

    public ValidationResponse(String status, String message, RegisterUser dataList) {
        this.status = status;
        this.message = message;
        this.dataList = dataList;
    }

//    public ValidationResponse(String error, String message, String data) {
//        this.error = error;
//        this.message = message;
//        this.data = data;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }

    //    public ValidationResponse() {
//    }
//
//    public ValidationResponse(String error) {
//        this.error = error;
//    }
//
//    public String getError() {
//        return error;
//    }
//
//    public void setError(String error) {
//        this.error = error;
//    }
}
