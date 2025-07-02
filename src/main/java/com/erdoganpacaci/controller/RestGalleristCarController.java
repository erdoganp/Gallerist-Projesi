package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoGalleristCar;
import com.erdoganpacaci.dto.DtoGalleristCarUI;
import com.erdoganpacaci.model.GalleristCar;

import java.util.List;

public interface RestGalleristCarController {
    public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarUI dtoGalleristCarUI);

    public RootEntity<List<DtoGalleristCar>> getGalleristCar();

    public RootEntity<DtoGalleristCar> getGalleristCarById(Long id);
}
