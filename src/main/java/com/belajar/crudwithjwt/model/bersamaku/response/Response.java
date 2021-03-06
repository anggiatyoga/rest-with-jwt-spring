package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

//@Entity
public class Response {

    private String code;
    private String description;

    public Response() {
    }

    public Response(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
