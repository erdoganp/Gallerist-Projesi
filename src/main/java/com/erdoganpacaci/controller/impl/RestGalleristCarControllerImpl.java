package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestBaseController;
import com.erdoganpacaci.controller.RestGalleristCarController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.DtoGalleristCar;
import com.erdoganpacaci.dto.DtoGalleristCarUI;
import com.erdoganpacaci.model.GalleristCar;
import com.erdoganpacaci.service.GalleristCarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/gallerist-car")
public class RestGalleristCarControllerImpl extends RestBaseController implements RestGalleristCarController {

    @Autowired
    private GalleristCarService galleristCarService;

    @PostMapping("/save")
    @Override
    public RootEntity<DtoGalleristCar> saveGalleristCar(@Valid @RequestBody DtoGalleristCarUI dtoGalleristCarUI) {
        return ok(galleristCarService.saveGalleristCar(dtoGalleristCarUI));
    }

    @GetMapping("/list")
    @Override
    public RootEntity<List<DtoGalleristCar>> getGalleristCar() {
        return ok(galleristCarService.getGalleristCar());
    }

    @GetMapping("/{id}")
    @Override
    public RootEntity<DtoGalleristCar> getGalleristCarById(@PathVariable(value = "id") Long id) {
        return ok(galleristCarService.getGalleristCarById(id));
    }
}
