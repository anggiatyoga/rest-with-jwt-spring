package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.delete.BrivaDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeleteRepository extends JpaRepository<BrivaDelete, String> {
}
