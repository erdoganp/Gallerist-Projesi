package com.erdoganpacaci.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DtoSaledCarUI {

    @NotNull
    private Long customerId;

    @NotNull
    private Long galleristId;

    @NotNull
    private Long carId;
}
