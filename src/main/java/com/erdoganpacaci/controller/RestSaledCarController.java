package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoSaledCar;
import com.erdoganpacaci.dto.DtoSaledCarUI;

public interface RestSaledCarController {


    public RootEntity<DtoSaledCar> buycar(DtoSaledCarUI dtoSaledCarUI);
}
