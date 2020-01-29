package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

//@Entity
public class TransactionID {

    private String stan;
    private String inst_ID;
    private String trans_Date_Time;

    public TransactionID() {
    }

    public TransactionID(String stan, String inst_ID, String trans_Date_Time) {
        this.stan = stan;
        this.inst_ID = inst_ID;
        this.trans_Date_Time = trans_Date_Time;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getInst_ID() {
        return inst_ID;
    }

    public void setInst_ID(String inst_ID) {
        this.inst_ID = inst_ID;
    }

    public String getTrans_Date_Time() {
        return trans_Date_Time;
    }

    public void setTrans_Date_Time(String trans_Date_Time) {
        this.trans_Date_Time = trans_Date_Time;
    }
}
