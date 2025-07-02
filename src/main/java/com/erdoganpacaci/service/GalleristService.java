package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoGallerist;
import com.erdoganpacaci.dto.DtoGalleristUI;

public interface GalleristService {

    public DtoGallerist saveGallerist(DtoGalleristUI dtoGalleristUI);

    public DtoGallerist updateGallerist(Long id, DtoGalleristUI dtoGalleristUI);

    public Void deleteGallerist(Long id);
}
