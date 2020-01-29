package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;
import java.util.ArrayList;

//@Entity
public class Sender {

    private String first_Name;
    private String middle_Name;
    private String last_Name;
    private String native_Name;
    private String msisdn;
    private String email;
    private String country;
    private String province;
    private String city;
    private String address;
    private String postal_Code;
    private String sender_Type;
    private ArrayList<Personal> personal;

    public Sender() {
    }

    public Sender(String first_Name, String middle_Name, String last_Name, String native_Name, String msisdn, String email, String country, String province, String city, String address, String postal_Code, String sender_Type, ArrayList<Personal> personal) {
        this.first_Name = first_Name;
        this.middle_Name = middle_Name;
        this.last_Name = last_Name;
        this.native_Name = native_Name;
        this.msisdn = msisdn;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.address = address;
        this.postal_Code = postal_Code;
        this.sender_Type = sender_Type;
        this.personal = personal;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getMiddle_Name() {
        return middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getNative_Name() {
        return native_Name;
    }

    public void setNative_Name(String native_Name) {
        this.native_Name = native_Name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        this.postal_Code = postal_Code;
    }

    public String getSender_Type() {
        return sender_Type;
    }

    public void setSender_Type(String sender_Type) {
        this.sender_Type = sender_Type;
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }
}

