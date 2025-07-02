package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoCar;
import com.erdoganpacaci.dto.DtoCarUI;

import java.util.List;

public interface CarService {

    public DtoCar saveCar(DtoCarUI dtoCarUI);

    public List<DtoCar> getCars();

    public DtoCar updateCar(Long id,DtoCarUI dtoCarUI);

    public Void deleteCar(Long id);
}
