package com.belajar.crudwithjwt.repository.bersamaku;

import com.belajar.crudwithjwt.model.bersamaku.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
