package com.erdoganpacaci.repository;

import com.erdoganpacaci.model.Address;
import com.erdoganpacaci.model.GalleristCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
