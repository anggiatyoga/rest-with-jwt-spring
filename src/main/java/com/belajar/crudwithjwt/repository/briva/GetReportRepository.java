package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.getreport.BrivaGetReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetReportRepository extends JpaRepository<BrivaGetReport, String> {
}
