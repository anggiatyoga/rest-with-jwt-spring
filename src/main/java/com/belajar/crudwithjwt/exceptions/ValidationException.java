package com.belajar.crudwithjwt.exceptions;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -7806029002430564887L;
    private String msg;
    private String status;
    private String data;

    public ValidationException(String msg) {
        this.msg = msg;
    }

    public ValidationException(String msg, String status, String data) {
        this.msg = msg;
        this.status = status;
        this.data = data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
