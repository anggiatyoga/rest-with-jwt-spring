package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer>{
    Boolean existsByUsername(String username);
    Boolean existsByNumberphone(String numberphone);
    Boolean existsByEmail(String email);

    RegisterUser findByUsername(String username);

    List<RegisterUser> findByUsernameOrNumberphoneOrEmail(String textOne, String textTwo, String textThree);
}
