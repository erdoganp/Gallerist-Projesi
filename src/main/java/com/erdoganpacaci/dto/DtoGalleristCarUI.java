package com.erdoganpacaci.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DtoGalleristCarUI {

    @NotNull
    private Long galleristId;

    @NotNull
    private Long carId;
}
