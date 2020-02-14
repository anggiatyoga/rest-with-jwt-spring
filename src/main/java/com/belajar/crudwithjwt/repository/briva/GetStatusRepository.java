package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.getstatus.BrivaGetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetStatusRepository extends JpaRepository<BrivaGetStatus, String> {
}
