package com.erdoganpacaci.repository;

import com.erdoganpacaci.model.Address;
import com.erdoganpacaci.model.Gallerist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GalleristRepository extends JpaRepository<Gallerist, Long> {


    @Query("SELECT a FROM Gallerist a LEFT JOIN FETCH a.address WHERE a.address.id = :id")
    Optional<Gallerist> findWithAddress(@Param("id") Long id);


}
