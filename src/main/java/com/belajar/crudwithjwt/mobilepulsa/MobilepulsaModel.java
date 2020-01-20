package com.belajar.crudwithjwt.mobilepulsa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilepulsaModel {

    @Id
    private long pulsa_price;

    private String pulsa_code;
    private String pulsa_op;
    private String pulsa_nominal;
    private String pulsa_type;
    private String masaaktif;
    private String status;

    public MobilepulsaModel() {
    }

    public MobilepulsaModel(long pulsa_price, String pulsa_code, String pulsa_op, String pulsa_nominal, String pulsa_type, String masaaktif, String status) {
        this.pulsa_price = pulsa_price;
        this.pulsa_code = pulsa_code;
        this.pulsa_op = pulsa_op;
        this.pulsa_nominal = pulsa_nominal;
        this.pulsa_type = pulsa_type;
        this.masaaktif = masaaktif;
        this.status = status;
    }

    public long getPulsa_price() {
        return pulsa_price;
    }

    public void setPulsa_price(long pulsa_price) {
        this.pulsa_price = pulsa_price;
    }

    public String getPulsa_code() {
        return pulsa_code;
    }

    public void setPulsa_code(String pulsa_code) {
        this.pulsa_code = pulsa_code;
    }

    public String getPulsa_op() {
        return pulsa_op;
    }

    public void setPulsa_op(String pulsa_op) {
        this.pulsa_op = pulsa_op;
    }

    public String getPulsa_nominal() {
        return pulsa_nominal;
    }

    public void setPulsa_nominal(String pulsa_nominal) {
        this.pulsa_nominal = pulsa_nominal;
    }

    public String getPulsa_type() {
        return pulsa_type;
    }

    public void setPulsa_type(String pulsa_type) {
        this.pulsa_type = pulsa_type;
    }

    public String getMasaaktif() {
        return masaaktif;
    }

    public void setMasaaktif(String masaaktif) {
        this.masaaktif = masaaktif;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
