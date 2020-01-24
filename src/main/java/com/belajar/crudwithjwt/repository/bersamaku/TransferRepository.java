package com.belajar.crudwithjwt.repository.bersamaku;

import com.belajar.crudwithjwt.model.bersamaku.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, String> {
}
