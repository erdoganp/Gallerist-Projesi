package com.erdoganpacaci.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class DtoAddressUI {


    @NotEmpty
    private String city;
    @NotEmpty
    private String  district;
    @NotEmpty
    private String neighborhood;
    @NotEmpty
    private String street;


}
