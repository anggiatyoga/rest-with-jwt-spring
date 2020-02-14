package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.get.BrivaGet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetRepository extends JpaRepository<BrivaGet, String> {
}
