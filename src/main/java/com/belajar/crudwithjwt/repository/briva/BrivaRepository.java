package com.belajar.crudwithjwt.repository.briva;

import com.belajar.crudwithjwt.model.briva.Briva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Repository
public interface BrivaRepository extends JpaRepository<Briva, String> {


}
