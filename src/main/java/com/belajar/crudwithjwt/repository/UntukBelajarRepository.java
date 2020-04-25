package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.UntukBelajar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UntukBelajarRepository extends JpaRepository<UntukBelajar, Integer> {
    Optional<UntukBelajar> findByName(String name);
    Boolean existsByName(String name);
}
