package com.belajar.crudwithjwt.model.bersamaku;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inquiry {

    @Id
    private long transactionID;

    private String refTrx;
    private String fee;
    private String mode;
    private String source;
    private String destination;
    private String rate;
    private String response;
    private String timestamp_response;
    private String signature;

    public Inquiry() {
    }

    public Inquiry(long transactionID, String refTrx, String fee, String mode, String source, String destination, String rate, String response, String timestamp_response, String signature) {
        this.transactionID = transactionID;
        this.refTrx = refTrx;
        this.fee = fee;
        this.mode = mode;
        this.source = source;
        this.destination = destination;
        this.rate = rate;
        this.response = response;
        this.timestamp_response = timestamp_response;
        this.signature = signature;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public String getRefTrx() {
        return refTrx;
    }

    public void setRefTrx(String refTrx) {
        this.refTrx = refTrx;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getTimestamp_response() {
        return timestamp_response;
    }

    public void setTimestamp_response(String timestamp_response) {
        this.timestamp_response = timestamp_response;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
