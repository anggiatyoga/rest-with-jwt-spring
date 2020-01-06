package com.belajar.crudwithjwt.model;

import javax.persistence.*;

@Entity
@Table(name = "biodata")
public class Biodata {

    @Id
    private long nik;

    private String nama;
    private String tempat_tanggallahir;
    private String jenis_kelamin;
    private String alamat;
    private String agama;
    private String status_perkawinan;
    private String pekerjaan;
    private String kewarganegaraan;

    public Biodata() {  }

    public Biodata(long nik, String nama, String tempat_tanggallahir, String jenis_kelamin, String alamat, String agama, String status_perkawinan, String pekerjaan, String kewarganegaraan) {
        this.nik = nik;
        this.nama = nama;
        this.tempat_tanggallahir = tempat_tanggallahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.status_perkawinan = status_perkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
    }

    public Biodata(String nama) {
        this.nama = nama;
    }

    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempat_tanggallahir() {
        return tempat_tanggallahir;
    }

    public void setTempat_tanggallahir(String tempat_tanggallahir) {
        this.tempat_tanggallahir = tempat_tanggallahir;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus_perkawinan() {
        return status_perkawinan;
    }

    public void setStatus_perkawinan(String status_perkawinan) {
        this.status_perkawinan = status_perkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    @Override
    public String toString() {
        return "biodata{"+
                "nik=" + nik  +
                ", nama='" + nama + '\'' +
                ", tempat_tanggallahir='" + tempat_tanggallahir + '\'' +
                ", jenis_kelamin='" + jenis_kelamin + '\'' +
                ", alamat='" + alamat + '\'' +
                ", agama='" + agama + '\'' +
                ", status_perkawinan='" + status_perkawinan + '\'' +
                ", pekerjaan='" + pekerjaan + '\'' +
                ", kewarganegaraan='" + kewarganegaraan + '\'' +
                '}';
    }

}
