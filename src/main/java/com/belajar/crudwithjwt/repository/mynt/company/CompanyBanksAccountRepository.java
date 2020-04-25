package com.belajar.crudwithjwt.repository.mynt.company;

import com.belajar.crudwithjwt.model.mynt.CompanyBanksAccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyBanksAccountRepository extends JpaRepository<CompanyBanksAccountModel, Long> {

}
