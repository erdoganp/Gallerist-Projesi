package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestBaseController;
import com.erdoganpacaci.controller.RestCurrencyRatesController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.CurrencyRatesResponse;
import com.erdoganpacaci.service.CurrencyRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/")
public class RestCurrencyRatesControllerImpl extends RestBaseController implements RestCurrencyRatesController {

    @Autowired
    private CurrencyRatesService currencyRatesService;

    @GetMapping("/currency-rates")
    @Override
    public RootEntity<CurrencyRatesResponse> getCurrencyRates(@RequestParam("startDate") String startDate,
                                                              @RequestParam("endDate") String endDate) {
        return ok(currencyRatesService.getCurrencyRates(startDate, endDate));
    }
}
