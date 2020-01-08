package com.belajar.crudwithjwt.exceptions;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -7806029002430564887L;
    private String msg;

    public ValidationException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
