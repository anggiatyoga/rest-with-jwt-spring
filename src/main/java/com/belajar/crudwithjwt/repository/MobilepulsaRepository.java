package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.Mobilepulsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilepulsaRepository extends JpaRepository<Mobilepulsa, Long> {

}
