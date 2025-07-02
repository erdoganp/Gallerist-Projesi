package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoSaledCar;
import com.erdoganpacaci.dto.DtoSaledCarUI;

public interface SaledCarService {

    public DtoSaledCar buyCar(DtoSaledCarUI dtoSaledCarUI);
}
