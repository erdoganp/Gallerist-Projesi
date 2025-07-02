package com.erdoganpacaci.service.Impl;

import com.erdoganpacaci.dto.CurrencyRatesResponse;
import com.erdoganpacaci.exception.BaseException;
import com.erdoganpacaci.exception.ErrorMessage;
import com.erdoganpacaci.exception.MessageType;
import com.erdoganpacaci.service.CurrencyRatesService;
import org.apache.catalina.connector.Response;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyRatesServiceImpl implements CurrencyRatesService {
    @Override
    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {

        //https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A&startDate=28-04-2025&endDate=29-04-2025&type=json
        String rootURL = "https://evds2.tcmb.gov.tr/service/evds/";
        String series = "TP.DK.USD.A";
        String type = "json";
        String endpoint = rootURL + "series=" + series + "&startDate=" + startDate + "&endDate=" + endDate + "&type=" + type;

        HttpHeaders headers = new HttpHeaders();
        headers.set("key", "XA1HzioXMD");

        HttpEntity<?> httpEntity = new HttpEntity<>(headers);

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endpoint, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<CurrencyRatesResponse>() {});
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            }
        }catch (Exception e) {
            throw new BaseException(new ErrorMessage(MessageType.CURRENCY_RATES_IS_OCCURED, e.getMessage()));

        }

        return null;
    }
}
