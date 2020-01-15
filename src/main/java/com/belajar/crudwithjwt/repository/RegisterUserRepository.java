package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.model.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, Integer>{
    Boolean existsByUsername(String username);
    Boolean existsByNumberphone(String numberphone);
    Boolean existsByEmail(String email);

    RegisterUser findByUsername(String username);

    Optional<RegisterUser> findByUsernameOrNumberphoneOrEmail(String textOne, String textTwo, String textThree);


    @Query(value = "select numberphone from user_info where username = 'sincan'", nativeQuery = true)
    public List<Object[]> findNumberphone();
}
