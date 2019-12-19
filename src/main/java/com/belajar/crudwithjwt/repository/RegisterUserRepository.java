package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer>{
    Boolean existsByUsername(String username);
    RegisterUser findByUsername(String username);
}
