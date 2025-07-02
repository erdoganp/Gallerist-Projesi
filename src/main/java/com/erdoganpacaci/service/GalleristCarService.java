package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoGalleristCar;
import com.erdoganpacaci.dto.DtoGalleristCarUI;

import java.util.List;

public interface GalleristCarService {

  public DtoGalleristCar saveGalleristCar(DtoGalleristCarUI dtoGalleristCarUI);

  public List<DtoGalleristCar> getGalleristCar();

  public DtoGalleristCar getGalleristCarById(Long id);
}
