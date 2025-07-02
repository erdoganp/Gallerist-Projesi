package com.erdoganpacaci.service.Impl;

import com.erdoganpacaci.dto.DtoAddress;
import com.erdoganpacaci.dto.DtoAddressUI;
import com.erdoganpacaci.exception.BaseException;
import com.erdoganpacaci.exception.ErrorMessage;
import com.erdoganpacaci.exception.MessageType;
import com.erdoganpacaci.model.Address;
import com.erdoganpacaci.model.Car;
import com.erdoganpacaci.model.Customer;
import com.erdoganpacaci.model.Gallerist;
import com.erdoganpacaci.repository.AddressRepository;
import com.erdoganpacaci.repository.CarRepository;
import com.erdoganpacaci.repository.CustomerRepository;
import com.erdoganpacaci.repository.GalleristRepository;
import com.erdoganpacaci.service.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository  customerRepository;

    @Autowired
    private GalleristRepository galleristRepository;
    @Autowired
    private CarRepository carRepository;

    private Address createAddress(DtoAddressUI dtoAddressUI) {

        Address address = new Address();
        address.setCreateTime(new Date());

        BeanUtils.copyProperties(dtoAddressUI, address);
        return address;

    }

    public DtoAddress saveAddress(DtoAddressUI dtoAddressUI) {

        DtoAddress dtoAddress = new DtoAddress();

        Address savedAddress=addressRepository.save(createAddress(dtoAddressUI));
        BeanUtils.copyProperties(savedAddress, dtoAddress);

        return dtoAddress;
    }

    @Override
    public DtoAddress updateAddress(Long id, DtoAddressUI dtoAddressUI) {

        DtoAddress dtoAddress = new DtoAddress();

        Optional<Address> optAddress= addressRepository.findById(id);


      if(optAddress.isEmpty()){

         throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
      }


        Address   address=optAddress.get();
        BeanUtils.copyProperties(dtoAddressUI,address);
        Address savedAddress= addressRepository.save(address);

        BeanUtils.copyProperties(savedAddress,dtoAddress);

      return dtoAddress;
    }

    @Override
    public Void deleteAddress(Long id) {

        Optional<Address> optAddress= addressRepository.findById(id);
        if(optAddress.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }

        Optional<Customer> optCustomer= customerRepository.findWithAddress(id);
        if(!optCustomer.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.DATA_IS_ALREADY_USED, id.toString()));
        }

        Optional<Gallerist> optGallerist = galleristRepository.findWithAddress(id);
        if(!optGallerist.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.DATA_IS_ALREADY_USED, id.toString()));
        }

        addressRepository.delete(optAddress.get());
        return null;
    }
}
