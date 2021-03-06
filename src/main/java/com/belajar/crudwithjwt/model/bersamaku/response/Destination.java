package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

//@Entity
public class Destination {

    private String amount;
    private String currency;
    private String country_Code;

    public Destination() {
    }

    public Destination(String amount, String currency, String country_Code) {
        this.amount = amount;
        this.currency = currency;
        this.country_Code = country_Code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry_Code() {
        return country_Code;
    }

    public void setCountry_Code(String country_Code) {
        this.country_Code = country_Code;
    }
}
