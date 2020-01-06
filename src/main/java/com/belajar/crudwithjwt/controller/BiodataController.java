package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.Biodata;
import com.belajar.crudwithjwt.repository.BiodataRepository;
import org.hibernate.annotations.SQLDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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
    @GetMapping("/biodata/show/{nik}")
    public Biodata show(@PathVariable long nik){
        long biodataNik = nik;
        return biodataRepository.findById(biodataNik).orElse(new Biodata());
    }

    //read (search by nama)
    @PostMapping("/biodata/search")
    public List<Biodata> search(@RequestBody Map<String, String> body) {
        String searchTerm = body.get("search");
        return biodataRepository.findByNama(searchTerm);
    }

    //create
    @PostMapping("/biodata/create")
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
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(nik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }
        return biodataRepository.save(new Biodata(nikNya, nama, tempatTanggallahir, jenisKelamin, alamat, agama,
                statusPerkawinan, pekerjaan, kewarganegaraan));
    }

    //update
    @PutMapping("/biodata/update/{nik}")
    public Biodata update(@PathVariable(value = "nik") long nik, @RequestBody Map<String, String> body){
        long dataNik = nik;
        Biodata biodata = biodataRepository.findById(dataNik).orElse(new Biodata());
        biodata.setNik(Long.parseLong(body.get("nik")));
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
    @DeleteMapping("/biodata/delete/{nik}")
    public ResponseEntity<?> delete(@PathVariable(value = "nik") long nik) throws ValidationException {
        Biodata biodata = biodataRepository.findById(nik).orElseThrow(() -> new ValidationException("nik "+nik));

        biodataRepository.delete(biodata);
        return ResponseEntity.ok().build();
    }

}