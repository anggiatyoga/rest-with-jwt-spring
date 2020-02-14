package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.updatestatus.BrivaUpdateStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateStatusRepository extends JpaRepository<BrivaUpdateStatus, String> {
}
