package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.Biodata;
import com.belajar.crudwithjwt.repository.BiodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/biodata")
    public List<Biodata> index(){
        return biodataRepository.findAll();
    }

    //read by id
    @GetMapping("/biodata/{id}")
    public Biodata show(@PathVariable String id){
        int biodataId = Integer.parseInt(id);
        return biodataRepository.findById(biodataId).orElse(new Biodata());
    }

    //create
    @PostMapping("/biodata")
    public Biodata create(@RequestBody Map<String, String> body){
        String nik = body.get("nik");
        String nama = body.get("nama");
        String tempatTanggallahir = body.get("tempat_tanggallahir");
        String jenisKelamin = body.get("jenis_kelamin");
        String alamat = body.get("alamat");
        String agama = body.get("agama");
        String statusPerkawinan = body.get("status_perkawinan");
        String pekerjaan = body.get("pekerjaan");
        String kewarganegaraan = body.get("kewarganegaraan");
        return biodataRepository.save(new Biodata(nik, nama, tempatTanggallahir, jenisKelamin, alamat, agama,
                statusPerkawinan, pekerjaan, kewarganegaraan));
    }

    //update
    @PutMapping("/biodata/{id}")
    public Biodata update(@PathVariable String id, @RequestBody Map<String, String> body){
        int blogId = Integer.parseInt(id);
        // getting blog
        Biodata biodata = biodataRepository.findById(blogId).orElse(new Biodata());
        biodata.setNik(body.get("nik"));
        biodata.setNama(body.get("nama"));
        biodata.setTempat_tanggallahir(body.get("tempat_tanggallahir"));
        biodata.setJenis_kelamin(body.get("jenis_kelamin"));
        biodata.setAlamat(body.get("alamat"));
        biodata.setAgama(body.get("agama"));
        biodata.setStatus_perkawinan(body.get("status_perkawinan"));
        biodata.setPekerjaan(body.get("pekerjaan"));
        biodata.setKewarganegaraan(body.get("kewarganegaraan"));
        return biodataRepository.save(biodata);
    }

    //delete
    @DeleteMapping("/biodata/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") String id) throws ValidationException {
        Biodata biodata = biodataRepository.findById(Integer.valueOf(id)).orElseThrow(() -> new ValidationException(id));

        biodataRepository.delete(biodata);
        return ResponseEntity.ok().build();
    }

}