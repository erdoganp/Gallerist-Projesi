package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.DtoAddress;
import com.erdoganpacaci.dto.DtoAddressUI;
import org.springframework.http.ResponseEntity;

public interface RestAddressController {

    public RootEntity<DtoAddress> saveAddress(DtoAddressUI dtoAddressUI);

    public RootEntity<DtoAddress> updateAddress(Long id,DtoAddressUI dtoAddressUI);

    public RootEntity<Void> deleteAddress(Long id);

}
