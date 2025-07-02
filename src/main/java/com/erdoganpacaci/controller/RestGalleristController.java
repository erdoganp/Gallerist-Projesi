package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoGallerist;
import com.erdoganpacaci.dto.DtoGalleristUI;
import org.springframework.http.ResponseEntity;

public interface RestGalleristController {

    public RootEntity<DtoGallerist> saveGallerist(DtoGalleristUI dtoGalleristUI);
    public RootEntity<DtoGallerist> updateGallerist(Long id, DtoGalleristUI dtoGalleristUI);
    ResponseEntity<Void> deleteGallerist(Long id);
}
