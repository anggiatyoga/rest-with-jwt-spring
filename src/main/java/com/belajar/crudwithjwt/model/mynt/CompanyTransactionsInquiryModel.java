package com.belajar.crudwithjwt.model.mynt;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_transaction_inquiry")
public class CompanyTransactionsInquiryModel {

    @Id
    private long inquiry_id;

    private String trace_id;
    private String service_code;
    private String service_name;
    private String account_number;
    private String account_name;
    private String bank_code;
    private String bank_name;
    private long amount;
    private String inquired_at;

    public CompanyTransactionsInquiryModel() {
    }

    public CompanyTransactionsInquiryModel(long inquiry_id, String trace_id, String service_code, String service_name, String account_number, String account_name, String bank_code, String bank_name, long amount, String inquired_at) {
        this.inquiry_id = inquiry_id;
        this.trace_id = trace_id;
        this.service_code = service_code;
        this.service_name = service_name;
        this.account_number = account_number;
        this.account_name = account_name;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.amount = amount;
        this.inquired_at = inquired_at;
    }

    public long getInquiry_id() {
        return inquiry_id;
    }

    public void setInquiry_id(long inquiry_id) {
        this.inquiry_id = inquiry_id;
    }

    public String getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }

    public String getService_code() {
        return service_code;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getInquired_at() {
        return inquired_at;
    }

    public void setInquired_at(String inquired_at) {
        this.inquired_at = inquired_at;
    }
}
