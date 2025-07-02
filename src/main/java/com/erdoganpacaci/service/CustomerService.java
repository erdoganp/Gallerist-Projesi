package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoAccountUI;
import com.erdoganpacaci.dto.DtoCustomer;
import com.erdoganpacaci.dto.DtoCustomerUI;

public interface CustomerService {

    public DtoCustomer saveCustomer(DtoCustomerUI dtoCustomerUI);

    public DtoCustomer updateCustomer(Long id, DtoCustomerUI dtoCustomerUI);

    public Void deleteCustomer(Long id);
}
