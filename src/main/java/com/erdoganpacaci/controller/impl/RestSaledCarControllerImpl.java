package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestSaledCarController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.DtoSaledCar;
import com.erdoganpacaci.dto.DtoSaledCarUI;
import com.erdoganpacaci.service.SaledCarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.erdoganpacaci.controller.RootEntity.ok;

@RestController
@RequestMapping("/rest/api/saled-car")
public class RestSaledCarControllerImpl implements RestSaledCarController {

    @Autowired
    private SaledCarService saledCarService;



    @PostMapping("/save")
    @Override
    public RootEntity<DtoSaledCar> buycar(@Valid @RequestBody DtoSaledCarUI dtoSaledCarUI) {
        return ok(saledCarService.buyCar(dtoSaledCarUI));
    }
}
