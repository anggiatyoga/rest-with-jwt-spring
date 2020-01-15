package com.belajar.crudwithjwt.exceptions;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -7806029002430564887L;
    private String message;
    private String status;
    private String data;
//    private RegisterUser dataList;
//    private List<String> userData;

    public ValidationException(String message) {
        this.message = message;
    }

//    public ValidationException(String msg, String status, RegisterUser dataList) {
//        this.msg = msg;
//        this.status = status;
//        this.dataList = dataList;
//    }

    public ValidationException(String message, String status, String data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

//    public ValidationException(String msg, String status, List<String> userData) {
//        this.msg = msg;
//        this.status = status;
//        this.userData = userData;
//    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public RegisterUser getDataList() {
//        return dataList;
//    }

//    public void setDataList(RegisterUser dataList) {
//        this.dataList = dataList;
//    }

//    public List<String> getUserData() {
//        return userData;
//    }

//    public void setUserData(List<String> userData) {
//        this.userData = userData;
//    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
