package com.belajar.crudwithjwt.repository.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.PaymentMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMPRepository extends JpaRepository<PaymentMP, Long> {

}
