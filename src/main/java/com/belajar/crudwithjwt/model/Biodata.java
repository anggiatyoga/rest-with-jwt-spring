package com.belajar.crudwithjwt.model;

import javax.persistence.*;

@Entity
@Table(name = "biodata")
public class Biodata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nik;
    private String nama;
    private String tempatTanggallahir;
    private String jenis_kelamin;
    private String alamat;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;

    public Biodata() {  }

    public Biodata(String nik, String nama, String tempatTanggallahir, String jenis_kelamin, String alamat, String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraan) {
        this.nik = nik;
        this.nama = nama;
        this.tempatTanggallahir = tempatTanggallahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
    }

    public Biodata(int id, String nik, String nama, String tempatTanggallahir, String jenis_kelamin, String alamat, String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraan) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.tempatTanggallahir = tempatTanggallahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
    }

    //    public Biodata(String title, String content) {
//        this.setTitle(title);
//        this.setContent(content);
//    }
//
//    public Biodata(int id, String title, String content) {
//        this.setId(id);
//        this.setTitle(title);
//        this.setContent(content);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatTanggallahir() {
        return tempatTanggallahir;
    }

    public void setTempatTanggallahir(String tempatTanggallahir) {
        this.tempatTanggallahir = tempatTanggallahir;
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

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
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
        return "biodata{" +
                "id=" + id +
                ", nik='" + nik + '\'' +
                ", nama='" + nama + '\'' +
                ", tempat_tanggallahir='" + tempatTanggallahir + '\'' +
                ", jenis_kelamin='" + jenis_kelamin + '\'' +
                ", alamat='" + alamat + '\'' +
                ", agama='" + agama + '\'' +
                ", status_perkawinan='" + statusPerkawinan + '\'' +
                ", pekerjaan='" + pekerjaan + '\'' +
                ", kewarganegaraan='" + kewarganegaraan + '\'' +
                '}';
    }

}
