package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.Biodata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Long> {

    List<Biodata> findByNama(String nama);

    @Override
    Optional<Biodata> findById(Long integer);


}
