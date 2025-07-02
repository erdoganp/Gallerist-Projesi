package com.erdoganpacaci.repository;

import com.erdoganpacaci.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
