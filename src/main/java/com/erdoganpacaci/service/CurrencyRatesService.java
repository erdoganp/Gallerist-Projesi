package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.CurrencyRatesResponse;

public interface CurrencyRatesService {

    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate);
}
