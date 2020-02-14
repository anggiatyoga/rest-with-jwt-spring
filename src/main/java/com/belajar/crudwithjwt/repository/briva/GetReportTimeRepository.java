package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.getreporttime.BrivaGetReportTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetReportTimeRepository extends JpaRepository<BrivaGetReportTime, String> {
}
