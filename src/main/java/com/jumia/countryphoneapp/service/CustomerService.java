package com.jumia.countryphoneapp.service;

import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> findAllOrBYCountryAndStatus(Country country, PhoneStatus status) ;
}
