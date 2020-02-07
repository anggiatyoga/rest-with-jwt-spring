package com.belajar.crudwithjwt.model.mynt;

import javax.persistence.Entity;

//@Entity
public class Transactions {

    private String status;
    private String transaction_id;
    private String transaction_name;
    private String related_account_number;
    private String related_account_name;
    private String amount;
    private String transaction_time;
    private String debit;
    private String credit;
    private String balance;

    public Transactions() {
    }

    public Transactions(String status, String transaction_id, String transaction_name, String related_account_number, String related_account_name, String amount, String transaction_time) {
        this.status = status;
        this.transaction_id = transaction_id;
        this.transaction_name = transaction_name;
        this.related_account_number = related_account_number;
        this.related_account_name = related_account_name;
        this.amount = amount;
        this.transaction_time = transaction_time;
    }

    public Transactions(String transaction_id, String transaction_name, String related_account_number, String related_account_name, String transaction_time, String debit, String credit, String balance) {
        this.transaction_id = transaction_id;
        this.transaction_name = transaction_name;
        this.related_account_number = related_account_number;
        this.related_account_name = related_account_name;
        this.transaction_time = transaction_time;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
    }
}
