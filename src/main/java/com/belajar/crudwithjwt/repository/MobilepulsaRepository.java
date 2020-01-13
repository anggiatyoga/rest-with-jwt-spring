package com.belajar.crudwithjwt.repository;

import com.belajar.crudwithjwt.mobilepulsa.MobilepuldaDataModel;
import com.belajar.crudwithjwt.mobilepulsa.MobilepulsaModel;
import com.belajar.crudwithjwt.model.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface MobilepulsaRepository extends JpaRepository<MobilepulsaModel, Long> {

//    @Override
//    Optional<MobilepulsaModel> findById(Long aLong);

    List<MobilepuldaDataModel> findGetAll();

    //    Optional<Biodata> findByNama(String nama);
}
