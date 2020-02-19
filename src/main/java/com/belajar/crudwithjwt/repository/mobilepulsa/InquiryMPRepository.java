package com.belajar.crudwithjwt.repository.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.InquiryMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryMPRepository extends JpaRepository<InquiryMP, Long> {
}
