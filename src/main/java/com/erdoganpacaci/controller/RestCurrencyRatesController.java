package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.CurrencyRatesResponse;

public interface RestCurrencyRatesController {


    public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate, String endDate);

}


