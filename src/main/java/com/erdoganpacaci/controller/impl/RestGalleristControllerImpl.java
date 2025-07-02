package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestBaseController;
import com.erdoganpacaci.controller.RestGalleristController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.DtoGallerist;
import com.erdoganpacaci.dto.DtoGalleristUI;
import com.erdoganpacaci.service.GalleristService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements RestGalleristController {


    @Autowired
    private GalleristService galleristService;

    @PostMapping("/save")
    @Override
    public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristUI dtoGalleristUI) {
        return ok(galleristService.saveGallerist(dtoGalleristUI));

    }

    @PutMapping("/update/{id}")
    @Override
    public RootEntity<DtoGallerist> updateGallerist(@Valid @PathVariable(value = "id") Long id,
                                                    @RequestBody DtoGalleristUI dtoGalleristUI) {
        return ok(galleristService.updateGallerist(id, dtoGalleristUI));
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity<Void> deleteGallerist(@PathVariable(value = "id") Long id) {
        galleristService.deleteGallerist(id);
        return ResponseEntity.noContent().build();
    }
}
