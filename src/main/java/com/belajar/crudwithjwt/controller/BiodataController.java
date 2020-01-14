package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.Biodata;
import com.belajar.crudwithjwt.repository.BiodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Map;

@RestController
public class BiodataController {

    @Autowired
    BiodataRepository biodataRepository;

    public BiodataController(BiodataRepository biodataRepository) {
        this.biodataRepository = biodataRepository;
    }

    //read all
    @GetMapping("/biodata/show")
    public List<Biodata> index(){
        return biodataRepository.findAll();
    }

    //read (search by nik)
    @PostMapping("/biodata/search/nik")
    public Biodata show(@RequestBody Map<String, String> body) {
        String searchNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(searchNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }
        return biodataRepository.findById(nikNya).orElseThrow(() -> new ValidationException("NIK "+searchNik+"tidak ditemukan"));
    }

    //read (search by nama)
    @PostMapping("/biodata/search/nama")
    public Biodata search(@RequestBody Map<String, String> body) {
        String searchName = body.get("nama");
        return biodataRepository.findByNama(searchName).orElseThrow(() -> new ValidationException("nama "+searchName+" tidak ditemukan"));
    }


    @PostMapping("/biodata/create")
    public ResponseEntity create(@RequestBody Map<String, String> body){
        String nik = body.get("nik");
        String nama = body.get("nama");
        String tempatTanggallahir = body.get("tempat_tanggallahir");
        String jenisKelamin = body.get("jenis_kelamin");
        String alamat = body.get("alamat");
        String agama = body.get("agama");
        String statusPerkawinan = body.get("status_perkawinan");
        String pekerjaan = body.get("pekerjaan");
        String kewarganegaraan = body.get("kewarganegaraan");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(nik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }

        if (biodataRepository.existsById(nikNya)) {
//            throw new ValidationException("" + username + " telah digunakan", "NIK "+nikNya+" telah digunakan", userData);
        } else {
            biodataRepository.save(new Biodata(nikNya, nama, tempatTanggallahir, jenisKelamin, alamat, agama,
                    statusPerkawinan, pekerjaan, kewarganegaraan));
        }

        return new ResponseEntity(HttpStatus.OK);
    }

    //update
    @PostMapping("/biodata/update")
    public ResponseEntity<?> update(@RequestBody Map<String, String> body) {
        String dataNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(dataNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }
        if (biodataRepository.existsById(nikNya)) {
            Biodata biodata = biodataRepository.findById(nikNya).orElse(new Biodata());
            biodata.setNama(body.get("nama"));
            biodata.setTempat_tanggallahir(body.get("tempat_tanggallahir"));
            biodata.setJenis_kelamin(body.get("jenis_kelamin"));
            biodata.setAlamat(body.get("alamat"));
            biodata.setAgama(body.get("agama"));
            biodata.setStatus_perkawinan(body.get("status_perkawinan"));
            biodata.setPekerjaan(body.get("pekerjaan"));
            biodata.setKewarganegaraan(body.get("kewarganegaraan"));
            biodataRepository.save(biodata);
//            throw new ValidationException("Berhasil di update");
            throw new ValidationException("Berhasil diupdate");
        } else {
            throw new ValidationException("NIK "+nikNya+" tidak ditemukan");
        }
    }

    //delete
    @DeleteMapping("/biodata/delete")
    public ResponseEntity<?> delete(@RequestBody Map<String, String> body) {
        String searchNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(searchNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }
        System.out.println("NIK : "+nikNya);
        Biodata biodata = biodataRepository.findById(nikNya).orElseThrow(() -> new ValidationException(searchNik + " tidak tersedia"));
        biodataRepository.delete(biodata);
        return ResponseEntity.ok().build();
    }

    public ErrorAttributes errorAttributes() {
        return new DefaultErrorAttributes() {
            @Override
            public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
                Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);

                return errorAttributes;
            }
        };
    }


}