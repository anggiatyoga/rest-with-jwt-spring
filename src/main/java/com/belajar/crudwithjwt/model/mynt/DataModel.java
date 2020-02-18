package com.belajar.crudwithjwt.model.mynt;

import javax.persistence.Entity;
import java.util.ArrayList;

//@Entity
public class DataModel {

    private String address;
    private String amount;
    private String avatar;
    private String account_name;
    private String account_number;
    private String bank_code;
    private String bank_id;
    private String bank_name;
    private String birth_date;
    private String birth_place;
    private String born_date;
    private String born_place;
    private String citizenship;
    private String code;
    private String commit_id;
    private String commit_trace_id;
    private String committed_at;
    private String country_code;
    private String country_name;
    private String created_at;
    private String updated_at;
    private String email;
    private String expired_at;
    private String fund_resource;
    private String gender;
    private String id;
    private String id_number;
    private String identity_date_type;
    private String identity_document;
    private String identity_number;
    private String identity_type;
    private String image;
    private String inquired_at;
    private String inquiry_id;
    private String inquiry_trace_id;
    private String ip_address;
    private String last_balance;
    private String last_updated_at;
    private String limit_balance;
    private String limit_transactions;
    private String logged_at;
    private String member_type;
    private String member_status;
    private String message;
    private String mynt_id;
    private String name;
    private String notified_at;
    private String occupation;
    private String old_pin;
    private String old_password;
    private String otp;
    private String page;
    private String page_total;
    private String password;
    private String password_confirmation;
    private String pin;
    private String pin_confirmation;
    private String province_code;
    private String phone;
    private String reference_code;
    private String referral;
    private String referral_code;
    private String referral_email;
    private String referral_name;
    private String referral_phone;
    private String regency_code;
    private String regency_name;
    private String registered_at;
    private String reject_reason;
    private String relationship;
    private String requested_at;
    private String reversal_id;
    private String reversal_trace_id;
    private String reversed_at;
    private String status;
    private String title;
    private String token;
    private String token_trx;
    private String total_transactions;
    private ArrayList<Transactions> transactions;
    private String trace_id;
    private String username;
    private String service_code;
    private String service_name;

    public DataModel() {
    }

    // API Login
//    public DataModel(String token) {
//        this.token = token;
//    }

    // company.member.profiles
    public DataModel(String account_number, String account_name, String referral_code, String referral_name, String referral_phone, String referral_email, String member_type, String member_status, String mynt_id, String last_balance, String limit_balance, String limit_transactions, String total_transactions, String avatar, String phone, String email, String address, String country_code, String country_name, String birth_date, String birth_place, String occupation, String citizenship, String id_number, String fund_resource, String reject_reason, String registered_at, String last_updated_at) {
        this.account_number = account_number;
        this.account_name = account_name;
        this.referral_code = referral_code;
        this.referral_name = referral_name;
        this.referral_phone = referral_phone;
        this.referral_email = referral_email;
        this.member_type = member_type;
        this.member_status = member_status;
        this.mynt_id = mynt_id;
        this.last_balance = last_balance;
        this.limit_balance = limit_balance;
        this.limit_transactions = limit_transactions;
        this.total_transactions = total_transactions;
        this.avatar = avatar;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.country_code = country_code;
        this.country_name = country_name;
        this.birth_date = birth_date;
        this.birth_place = birth_place;
        this.occupation = occupation;
        this.citizenship = citizenship;
        this.id_number = id_number;
        this.fund_resource = fund_resource;
        this.reject_reason = reject_reason;
        this.registered_at = registered_at;
        this.last_updated_at = last_updated_at;
    }

    // company.member.logs.access
    public DataModel(String ip_address){
        this.ip_address = ip_address;
    }

    // company.member.logs.notifications
    public DataModel(String title, String message, String notified_at) {
        this.title = title;
        this.message = message;
        this.notified_at = notified_at;
    }

    // company.member.banks.regencies
//    public DataModel(String regency_code, String regency_name) {
//        this.regency_code = regency_code;
//        this.regency_name = regency_name;
//    }

    // company.member.banks.province
    public DataModel(String code, String created_at, String updated_at, String id, String name) {
        this.code = code;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.id = id;
        this.name = name;
    }

//     company.member.banks.code
//    public DataModel(String bank_code, String bank_name){
//        this.bank_code = bank_code;
//        this.bank_name = bank_name;
//    }

    // company.member.banks.account
//    public DataModel(String status, String bank_id, String bank_code, String bank_name, String account_number, String account_name, String registered_at) {
//        this.status = status;
//        this.bank_id = bank_id;
//        this.bank_code = bank_code;
//        this.bank_name = bank_name;
//        this.account_number = account_number;
//        this.account_name = account_name;
//        this.registered_at = registered_at;
//    }

    // company.member.services mynt to mynt || mynt to bank ||  payment
//    public DataModel(String service_code, String service_name){
//        this.service_code = service_code;
//        this.service_name = service_name;
//    }

    // company.member.transactions.inquiry
    public DataModel(String amount, String account_name, String account_number, String bank_code, String bank_name, String inquired_at, String inquiry_id, String reference_code, String trace_id, String service_code, String service_name) {
        this.amount = amount;
        this.account_name = account_name;
        this.account_number = account_number;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.inquired_at = inquired_at;
        this.inquiry_id = inquiry_id;
        this.reference_code = reference_code;
        this.trace_id = trace_id;
        this.service_code = service_code;
        this.service_name = service_name;
    }

    // company.member.transactions.commit | company.member.transactions.inquiry
    public DataModel(String amount, String account_name, String account_number, String bank_code, String bank_name, String commit_id, String committed_at, String inquired_at, String inquiry_id, String reference_code, String trace_id, String service_code, String service_name) {
        this.amount = amount;
        this.account_name = account_name;
        this.account_number = account_number;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.commit_id = commit_id;
        this.committed_at = committed_at;
        this.inquired_at = inquired_at;
        this.inquiry_id = inquiry_id;
        this.reference_code = reference_code;
        this.trace_id = trace_id;
        this.service_code = service_code;
        this.service_name = service_name;
    }

    // company.member.banks.account
    public DataModel(String status, String bank_id, String bank_code, String bank_name, String account_number, String account_name, String registered_at) {
        this.status = status;
        this.bank_id = bank_id;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.account_number = account_number;
        this.account_name = account_name;
        this.registered_at = registered_at;
    }

    // company.member.token.generate
    public DataModel(String token_trx, String expired_at){
        this.token_trx = token_trx;
        this.expired_at = expired_at;
    }

    // company.member.accounts.recipients
    public DataModel(String account_name, String account_number, String bank_code, String bank_name) {
        this.account_name = account_name;
        this.account_number = account_number;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
    }

    // company.member.transactions.status
    public DataModel(String amount, String account_name, String account_number, String bank_code, String bank_name, String commit_id, String commit_trace_id, String committed_at, String inquired_at, String inquiry_id, String inquiry_trace_id, String requested_at, String reversal_id, String reversal_trace_id, String reversed_at, String status, String trace_id, String service_code, String service_name) {
        this.amount = amount;
        this.account_name = account_name;
        this.account_number = account_number;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.commit_id = commit_id;
        this.commit_trace_id = commit_trace_id;
        this.committed_at = committed_at;
        this.inquired_at = inquired_at;
        this.inquiry_id = inquiry_id;
        this.inquiry_trace_id = inquiry_trace_id;
        this.requested_at = requested_at;
        this.reversal_id = reversal_id;
        this.reversal_trace_id = reversal_trace_id;
        this.reversed_at = reversed_at;
        this.status = status;
        this.trace_id = trace_id;
        this.service_code = service_code;
        this.service_name = service_name;
    }

    // company.member.transactions.history.success || company.member.transactions.history.progress
    public DataModel(String page, String page_total, ArrayList<Transactions> transactions) {
        this.page = page;
        this.page_total = page_total;
        this.transactions = transactions;
    }



}
