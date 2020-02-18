package com.belajar.crudwithjwt.model.mobilepulsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private long tr_id;

    private String code;
    private String datetime;
    private String hp;
    private String tr_name;
    private String period;
    private long nominal;
    private long admin;
    private String message;
    private long selling_price;
    private String noref;
    private String ref_id;

    public Payment() {
    }

    public Payment(long tr_id, String code, String datetime, String hp, String tr_name, String period, long nominal, long admin, String message, long selling_price, String noref, String ref_id) {
        this.tr_id = tr_id;
        this.code = code;
        this.datetime = datetime;
        this.hp = hp;
        this.tr_name = tr_name;
        this.period = period;
        this.nominal = nominal;
        this.admin = admin;
        this.message = message;
        this.selling_price = selling_price;
        this.noref = noref;
        this.ref_id = ref_id;
    }

    public long getTr_id() {
        return tr_id;
    }

    public void setTr_id(long tr_id) {
        this.tr_id = tr_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getTr_name() {
        return tr_name;
    }

    public void setTr_name(String tr_name) {
        this.tr_name = tr_name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public long getAdmin() {
        return admin;
    }

    public void setAdmin(long admin) {
        this.admin = admin;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(long selling_price) {
        this.selling_price = selling_price;
    }

    public String getNoref() {
        return noref;
    }

    public void setNoref(String noref) {
        this.noref = noref;
    }

    public String getRef_id() {
        return ref_id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }
}
