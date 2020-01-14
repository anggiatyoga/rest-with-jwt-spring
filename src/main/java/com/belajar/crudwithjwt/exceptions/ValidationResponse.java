package com.belajar.crudwithjwt.exceptions;

import com.belajar.crudwithjwt.model.RegisterUser;

import java.util.ArrayList;

public class ValidationResponse {
    private String error;
    private String message;
    private String data;

    public ValidationResponse(String msg, String status, ArrayList<RegisterUser> dataList) {
    }

    public ValidationResponse(String error, String message, String data) {
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

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
