package com.belajar.crudwithjwt.repository.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.MobilepulsaMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilepulsaRepository extends JpaRepository<MobilepulsaMP, Long> {

}
