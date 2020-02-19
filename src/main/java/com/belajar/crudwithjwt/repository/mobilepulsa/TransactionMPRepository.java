package com.belajar.crudwithjwt.repository.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.TransactionMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMPRepository extends JpaRepository<TransactionMP, Long> {
}
