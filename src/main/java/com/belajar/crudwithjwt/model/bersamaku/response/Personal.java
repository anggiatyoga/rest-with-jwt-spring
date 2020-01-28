package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

@Entity
public class Personal {

    private String id_Type;
    private String gender;
    private String id_Number;
    private String id_Establish_Date;
    private String id_Expired_Date;
    private String country_Of_Birth;
    private String date_Of_Birth;
    private String nationality;
    private String occupation;


    public Personal() {
    }

    public Personal(String id_Type, String gender, String id_Number, String id_Establish_Date, String id_Expired_Date, String country_Of_Birth, String date_Of_Birth, String nationality, String occupation) {
        this.id_Type = id_Type;
        this.gender = gender;
        this.id_Number = id_Number;
        this.id_Establish_Date = id_Establish_Date;
        this.id_Expired_Date = id_Expired_Date;
        this.country_Of_Birth = country_Of_Birth;
        this.date_Of_Birth = date_Of_Birth;
        this.nationality = nationality;
        this.occupation = occupation;
    }

    public String getId_Type() {
        return id_Type;
    }

    public void setId_Type(String id_Type) {
        this.id_Type = id_Type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId_Number() {
        return id_Number;
    }

    public void setId_Number(String id_Number) {
        this.id_Number = id_Number;
    }

    public String getId_Establish_Date() {
        return id_Establish_Date;
    }

    public void setId_Establish_Date(String id_Establish_Date) {
        this.id_Establish_Date = id_Establish_Date;
    }

    public String getId_Expired_Date() {
        return id_Expired_Date;
    }

    public void setId_Expired_Date(String id_Expired_Date) {
        this.id_Expired_Date = id_Expired_Date;
    }

    public String getCountry_Of_Birth() {
        return country_Of_Birth;
    }

    public void setCountry_Of_Birth(String country_Of_Birth) {
        this.country_Of_Birth = country_Of_Birth;
    }

    public String getDate_Of_Birth() {
        return date_Of_Birth;
    }

    public void setDate_Of_Birth(String date_Of_Birth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
