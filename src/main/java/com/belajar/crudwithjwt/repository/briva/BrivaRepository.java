package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.create.BrivaCreate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrivaRepository extends JpaRepository<BrivaCreate, String> {
}
