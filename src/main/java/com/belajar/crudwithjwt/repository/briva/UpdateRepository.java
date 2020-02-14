package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.update.BrivaUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateRepository extends JpaRepository<BrivaUpdate, String> {
}
