package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

@Entity
public class RefTrx {

    private String code;
    private String exp_Date;

    public RefTrx() {
    }

    public RefTrx(String code, String exp_Date) {
        this.code = code;
        this.exp_Date = exp_Date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExp_Date() {
        return exp_Date;
    }

    public void setExp_Date(String exp_Date) {
        this.exp_Date = exp_Date;
    }
}
