package com.erdoganpacaci.dto;

import com.erdoganpacaci.enums.CurrencyType;
import com.erdoganpacaci.model.CarStatusType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DtoCar extends DtoBase{

    private String plaka;


    private String brand;


    private String model;


    private Integer productionYear;


    private BigDecimal price;

    private CurrencyType currencyType;


    private BigDecimal damagePrice;

    private CarStatusType carStatusType;
}
