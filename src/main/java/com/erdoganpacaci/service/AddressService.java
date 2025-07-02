package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.DtoAddress;
import com.erdoganpacaci.dto.DtoAddressUI;
import com.erdoganpacaci.exception.BaseException;

public interface AddressService {


    public DtoAddress saveAddress(DtoAddressUI dtoAddressUI) ;

    public DtoAddress updateAddress(Long id,DtoAddressUI dtoAddressUI);

    public Void deleteAddress(Long id);
}
