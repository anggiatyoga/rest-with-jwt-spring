package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.Authenticate;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticateRepository extends JpaRepository<Authenticate, String> {
    Boolean existsByUsername(String username);

    @Override
    Optional<Authenticate> findById(String saaa);

    Optional<Authenticate> findByUsername(String username);

}
