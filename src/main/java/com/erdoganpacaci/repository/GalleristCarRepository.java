package com.erdoganpacaci.repository;

import com.erdoganpacaci.model.GalleristCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GalleristCarRepository extends JpaRepository<GalleristCar, Long> {

    @Query("SELECT c FROM GalleristCar c LEFT JOIN FETCH c.car WHERE c.car.id = :id")
    Optional<GalleristCar> findWithCars(@Param("id") Long id);



    @Query("SELECT c FROM GalleristCar c LEFT JOIN FETCH c.gallerist WHERE c.gallerist.id= :id")
    Optional<GalleristCar> findWithGallerist(@Param("id") Long id);

}
