package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoCar;
import com.erdoganpacaci.dto.DtoCarUI;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestCarController {

    RootEntity<DtoCar> saveCar(DtoCarUI dtoCarUI);

    RootEntity<List<DtoCar>> getCars();

    RootEntity<DtoCar> updateCar(Long id,DtoCarUI dtoCarUI);

    RootEntity<Void> deleteCar(Long id);
}
