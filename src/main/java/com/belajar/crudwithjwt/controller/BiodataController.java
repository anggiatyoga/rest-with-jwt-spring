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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BiodataController {

    @Autowired
    BiodataRepository biodataRepository;

    public BiodataController(BiodataRepository biodataRepository) {
        this.biodataRepository = biodataRepository;
    }

    //read (search by nik)
    @PostMapping("/biodata/search/nik")
    public Map<String, Object> show(@RequestBody Map<String, String> body) {
        String searchNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(searchNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }

        String status;
        String message;

        Optional<Biodata> biodataList = biodataRepository.findById(nikNya);

        Map<String, Object> map = new HashMap<>();

        if (biodataList.isPresent()) {
            message = "pencarian ditemukan";
            status = "301(Found)";

            map.put("data", new HashMap<String, Object>() {
                {
                    put("nik", biodataList.get().getNik());
                    put("nama",biodataList.get().getNama());
                    put("tempatTanggallahir",biodataList.get().getTempat_tanggallahir());
                    put("jenisKelamin",biodataList.get().getJenis_kelamin());
                    put("alamat",biodataList.get().getAlamat());
                    put("agama",biodataList.get().getAgama());
                    put("statusPerkawinan",biodataList.get().getStatus_perkawinan());
                    put("pekerjaan",biodataList.get().getPekerjaan());
                    put("kewarganegaraan",biodataList.get().getKewarganegaraan());
                }
            });
            map.put("status", status);
            map.put("message", message);
        } else {
            message = "pencarian tidak ditemukan";
            status = "404(Not Found)";

            map.put("data", "tidak ditemukan");
            map.put("status", status);
            map.put("message", message);
        }

        return map;
    }

    //read (search by nama)
    @PostMapping("/biodata/search/nama")
    public Map<String, Object> search(@RequestBody Map<String, String> body) {
        String searchName = body.get("nama");

        String status;
        String message;

        Optional<Biodata> biodataList = biodataRepository.findByNama(searchName);

        Map<String, Object> map = new HashMap<>();

        if (biodataList.isPresent()) {
            message = "pencarian ditemukan";
            status = "301(Found)";

            map.put("data", new HashMap<String, Object>() {
                {
                    put("nik", biodataList.get().getNik());
                    put("nama",biodataList.get().getNama());
                    put("tempatTanggallahir",biodataList.get().getTempat_tanggallahir());
                    put("jenisKelamin",biodataList.get().getJenis_kelamin());
                    put("alamat",biodataList.get().getAlamat());
                    put("agama",biodataList.get().getAgama());
                    put("statusPerkawinan",biodataList.get().getStatus_perkawinan());
                    put("pekerjaan",biodataList.get().getPekerjaan());
                    put("kewarganegaraan",biodataList.get().getKewarganegaraan());
                }
            });
            map.put("status", status);
            map.put("message", message);
        } else {
            message = "pencarian tidak ditemukan";
            status = "404(Not Found)";

            map.put("data", "tidak ditemukan");
            map.put("status", status);
            map.put("message", message);
        }

        return map;
    }


    @PostMapping("/biodata/create")
    public Map<String, Object> create(@RequestBody Map<String, String> body){

        String nik = body.get("nik");
        String nama = body.get("nama");
        String tempatTanggallahir = body.get("tempatTanggallahir");
        String jenisKelamin = body.get("jenisKelamin");
        String alamat = body.get("alamat");
        String agama = body.get("agama");
        String statusPerkawinan = body.get("statusPerkawinan");
        String pekerjaan = body.get("pekerjaan");
        String kewarganegaraan = body.get("kewarganegaraan");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(nik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }

        String status;
        String message;

        if (biodataRepository.existsById(nikNya)) {
            message = "NIK telah digunakan";
            status = "400(Bad Request)";
        } else {
            biodataRepository.save(new Biodata(nikNya, nama, tempatTanggallahir, jenisKelamin, alamat, agama,
                    statusPerkawinan, pekerjaan, kewarganegaraan));
            message = "Berhasil dibuat";
            status = "201(Created)";
        }

        Map<String, Object> map = new HashMap<>();
        long finalNikNya = nikNya;
        map.put("data", new HashMap<String, String>(){
            {
                put("nik", String.valueOf(finalNikNya));
                put("nama",nama);
                put("tempatTanggallahir",tempatTanggallahir);
                put("jenisKelamin",jenisKelamin);
                put("alamat",alamat);
                put("agama",agama);
                put("statusPerkawinan",statusPerkawinan);
                put("pekerjaan",pekerjaan);
                put("kewarganegaraan",kewarganegaraan);
            }
        });
        map.put("status", status);
        map.put("message", message);

        return map;
    }

    //update
    @PostMapping("/biodata/update")
    public Map<String, Object> update(@RequestBody Map<String, String> body) {

        String dataNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(dataNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }

        Map<String, Object> map = new HashMap<>();

        if (biodataRepository.existsById(nikNya)) {
            Biodata biodata = biodataRepository.findById(nikNya).orElse(new Biodata());
            biodata.setNama(body.get("nama"));
            biodata.setTempat_tanggallahir(body.get("tempatTanggallahir"));
            biodata.setJenis_kelamin(body.get("jenisKelamin"));
            biodata.setAlamat(body.get("alamat"));
            biodata.setAgama(body.get("agama"));
            biodata.setStatus_perkawinan(body.get("statusPerkawinan"));
            biodata.setPekerjaan(body.get("pekerjaan"));
            biodata.setKewarganegaraan(body.get("kewarganegaraan"));
            biodataRepository.save(biodata);
            long finalNikNya = nikNya;
            map.put("data", new HashMap<String, String>(){
                {
                    put("nik", String.valueOf(finalNikNya));
                    put("nama",body.get("nama"));
                    put("tempatTanggallahir",body.get("tempatTanggallahir"));
                    put("jenisKelamin",body.get("jenisKelamin"));
                    put("alamat",body.get("alamat"));
                    put("agama",body.get("agama"));
                    put("statusPerkawinan",body.get("statusPerkawinan"));
                    put("pekerjaan",body.get("pekerjaan"));
                    put("kewarganegaraan", body.get("kewarganegaraan"));
                }
            });
            map.put("status", "201(Created)");
            map.put("message", "Berhasil diubah");
        } else {
            map.put("data", null);
            map.put("status", "404(Not Found)");
            map.put("message", nikNya+" tidak terdaftar");
        }

        return map;
    }

    //delete
    @PostMapping("/biodata/delete")
    public Map<String, Object> delete(@RequestBody Map<String, String> body) {
        String searchNik = body.get("nik");
        long nikNya = 0;
        try {
            nikNya = Long.parseLong(searchNik);
        } catch (NumberFormatException e){
            System.out.println("not a number");
        }

        Map<String, Object> map = new HashMap<>();
        long finalNikNya = nikNya;

        map.put("data",null);
        map.put("status", "201(Created)");
        map.put("message", finalNikNya+" berhasil dihapus");

        Biodata biodata = biodataRepository.findById(nikNya).orElseThrow(() -> new ValidationException(""+finalNikNya+" tidak ditemukan", "404(Not Found)", null));
        biodataRepository.delete(biodata);
        return map;
    }

    //read all
    @GetMapping("/biodata/show")
    public Map<String, Object> showAllList() {

        List<Biodata> biodataList = biodataRepository.findAll();

        int batasList = biodataList.size();

        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<Integer, Object>(){
            {

                for (int i=0; i<batasList; i++){
                    int finalI = i;
                    put(i, new HashMap<String, Object>(){
                        {
                            for (int j=0; j<9; j++){
                                if (j == 0){
                                    put("nik", biodataList.get(finalI).getNik());
                                } else if (j == 1) {
                                    put("nama", biodataList.get(finalI).getNama());
                                } else if (j == 2) {
                                    put("tempatTanggallahir", biodataList.get(finalI).getTempat_tanggallahir());
                                } else if (j == 3) {
                                    put("jenisKelamin", biodataList.get(finalI).getJenis_kelamin());
                                } else if (j == 4) {
                                    put("alamat", biodataList.get(finalI).getAlamat());
                                } else if (j == 5) {
                                    put("agama", biodataList.get(finalI).getAgama());
                                } else if (j == 6) {
                                    put("statusPerkawinan", biodataList.get(finalI).getStatus_perkawinan());
                                } else if (j == 7) {
                                    put("pekerjaan", biodataList.get(finalI).getPekerjaan());
                                } else if (j == 8) {
                                    put("kewarganegaraan", biodataList.get(finalI).getKewarganegaraan());
                                }
                            }
                        }
                    });
                }
            }
        });
        map.put("status", "200(Ok)");
        map.put("message","Succses");

        return map;
    }




}