package com.belajar.crudwithjwt.repository.bersamaku;

import com.belajar.crudwithjwt.model.bersamaku.GetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetTokenRepository extends JpaRepository<GetToken, String> {
}
