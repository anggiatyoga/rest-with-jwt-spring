package com.belajar.crudwithjwt.model.mynt;

import javax.persistence.*;

@Entity
@Table(name = "company_banksaccount")
public class CompanyBanksAccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bank_code;
    private String account_number;
    private String account_name;
    private String relationship;
    private String regency_code;
    private String province_code;
    private String id_number;
    private String address;

    public CompanyBanksAccountModel() {
    }

    public CompanyBanksAccountModel(String bank_code, String account_number, String account_name, String relationship, String regency_code, String province_code, String id_number, String address) {
        this.bank_code = bank_code;
        this.account_number = account_number;
        this.account_name = account_name;
        this.relationship = relationship;
        this.regency_code = regency_code;
        this.province_code = province_code;
        this.id_number = id_number;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRegency_code() {
        return regency_code;
    }

    public void setRegency_code(String regency_code) {
        this.regency_code = regency_code;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
