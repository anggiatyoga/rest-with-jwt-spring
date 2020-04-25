package com.belajar.crudwithjwt.repository.mynt.company;

import com.belajar.crudwithjwt.model.mynt.CompanyTransactionsInquiryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyTransactionInquiryRepository extends JpaRepository<CompanyTransactionsInquiryModel, Long> {
}
