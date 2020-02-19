package com.belajar.crudwithjwt.model.bersamaku;

import javax.persistence.*;

@Entity
@Table(name = "bersamaku_inquiry")
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String stan;
    private String inst_ID;
    private String trans_Date_Time;
    private String refTrx_code;
    private String source_amount;
    private String source_currency;
    private String source_country_code;
    private String destination_amount;
    private String destination_currency;
    private String destination_country_code;
    private String timestamp_response;
    private String siganture;

    public Inquiry() {
    }

    public Inquiry(String stan, String inst_ID, String trans_Date_Time, String refTrx_code, String source_amount, String source_currency, String source_country_code, String destination_amount, String destination_currency, String destination_country_code, String timestamp_response, String siganture) {
        this.stan = stan;
        this.inst_ID = inst_ID;
        this.trans_Date_Time = trans_Date_Time;
        this.refTrx_code = refTrx_code;
        this.source_amount = source_amount;
        this.source_currency = source_currency;
        this.source_country_code = source_country_code;
        this.destination_amount = destination_amount;
        this.destination_currency = destination_currency;
        this.destination_country_code = destination_country_code;
        this.timestamp_response = timestamp_response;
        this.siganture = siganture;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRefTrx_code() {
        return refTrx_code;
    }

    public void setRefTrx_code(String refTrx_code) {
        this.refTrx_code = refTrx_code;
    }

    public String getSource_amount() {
        return source_amount;
    }

    public void setSource_amount(String source_amount) {
        this.source_amount = source_amount;
    }

    public String getSource_currency() {
        return source_currency;
    }

    public void setSource_currency(String source_currency) {
        this.source_currency = source_currency;
    }

    public String getSource_country_code() {
        return source_country_code;
    }

    public void setSource_country_code(String source_country_code) {
        this.source_country_code = source_country_code;
    }

    public String getDestination_amount() {
        return destination_amount;
    }

    public void setDestination_amount(String destination_amount) {
        this.destination_amount = destination_amount;
    }

    public String getDestination_currency() {
        return destination_currency;
    }

    public void setDestination_currency(String destination_currency) {
        this.destination_currency = destination_currency;
    }

    public String getDestination_country_code() {
        return destination_country_code;
    }

    public void setDestination_country_code(String destination_country_code) {
        this.destination_country_code = destination_country_code;
    }

    public String getTimestamp_response() {
        return timestamp_response;
    }

    public void setTimestamp_response(String timestamp_response) {
        this.timestamp_response = timestamp_response;
    }

    public String getSiganture() {
        return siganture;
    }

    public void setSiganture(String siganture) {
        this.siganture = siganture;
    }
}
