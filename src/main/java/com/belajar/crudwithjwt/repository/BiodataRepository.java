package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.Biodata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Integer> {

//    List<Biodata> findByTitleContainingOrContentContaining(String text, String textAgain);

//    List<Biodata> findDataFromAText(String nik, String nama, String tempatTanggallahir, String jenis_kelamin, String alamat,
//                                    String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraan);
}
