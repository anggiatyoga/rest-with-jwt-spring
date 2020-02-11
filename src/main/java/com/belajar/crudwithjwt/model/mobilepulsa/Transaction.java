package com.belajar.crudwithjwt.model.mobilepulsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    private long ref_id;

    private int status;
    private String code;
    private String hp;
    private long price;
    private String message;
    private long balance;
    private long tr_id;
    private String rc;

    public Transaction() {
    }

    public Transaction(long ref_id, int status, String code, String hp, long price, String message, long balance, long tr_id, String rc) {
        this.ref_id = ref_id;
        this.status = status;
        this.code = code;
        this.hp = hp;
        this.price = price;
        this.message = message;
        this.balance = balance;
        this.tr_id = tr_id;
        this.rc = rc;
    }

    public long getRef_id() {
        return ref_id;
    }

    public void setRef_id(long ref_id) {
        this.ref_id = ref_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getTr_id() {
        return tr_id;
    }

    public void setTr_id(long tr_id) {
        this.tr_id = tr_id;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }
}
