package com.belajar.crudwithjwt.repository.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
