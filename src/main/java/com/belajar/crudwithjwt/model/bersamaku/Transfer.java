package com.belajar.crudwithjwt.model.bersamaku;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfer {

    @Id
    private long transactionId;

    private String ref;
    private String fee;
    private String mode;
    private String source;
    private String destination;
    private String rate;
    private String response;
    private String timestampResponse;
    private String signature;

    public Transfer() {
    }

    public Transfer(long transactionId, String ref, String fee, String mode, String source, String destination, String rate, String response, String timestampResponse, String signature) {
        this.transactionId = transactionId;
        this.ref = ref;
        this.fee = fee;
        this.mode = mode;
        this.source = source;
        this.destination = destination;
        this.rate = rate;
        this.response = response;
        this.timestampResponse = timestampResponse;
        this.signature = signature;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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

    public String getTimestampResponse() {
        return timestampResponse;
    }

    public void setTimestampResponse(String timestampResponse) {
        this.timestampResponse = timestampResponse;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
