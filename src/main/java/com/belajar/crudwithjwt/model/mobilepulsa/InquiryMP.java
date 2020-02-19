package com.belajar.crudwithjwt.model.mobilepulsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inquiry")
public class InquiryMP {

    @Id
    private long tr_id;

    private String code;
    private String hp;
    private String tr_name;
    private String period;
    private long nominal;
    private int admin;
    private String ref_id;
    private long selling_price;

    public InquiryMP() {
    }

    public InquiryMP(long tr_id, String code, String hp, String tr_name, String period, long nominal, int admin, String ref_id, long selling_price) {
        this.tr_id = tr_id;
        this.code = code;
        this.hp = hp;
        this.tr_name = tr_name;
        this.period = period;
        this.nominal = nominal;
        this.admin = admin;
        this.ref_id = ref_id;
        this.selling_price = selling_price;
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

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public String getRef_id() {
        return ref_id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    public long getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(long selling_price) {
        this.selling_price = selling_price;
    }
}
