package com.jumia.countryphoneapp.service;

import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;
import com.jumia.countryphoneapp.mapper.CustomerMapper;
import com.jumia.countryphoneapp.repositories.CustomerRepository;
import com.jumia.countryphoneapp.validators.PhoneValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<CustomerDto> findAllOrBYCountryAndStatus(Country country, PhoneStatus status) {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        Optional.ofNullable(customerRepository.findAll()).map(entities -> entities.stream()
                .map(CustomerMapper.INSTANCE::convertToDto).collect(Collectors.toList())) .orElse(Collections.emptyList()).stream().forEach(customer -> {
//            CustomerDto customerDto = new CustomerDto();
//            customerDto.setName(customer.getName());
//            customerDto.setId(customer.getId());
//            customerDto.setPhone(customer.getPhone());
            customer.setCountry(Country.getCountryByPhone(customer.getPhone()));
            customer.setPhoneStatus(PhoneValidator.isValid(customer.getCountry(), customer.getPhone()));
            customerDtoList.add(customer);
        });
        return customerDtoList.stream().filter(c -> country == null || c.getCountry() == country)
                .filter(c -> status == null || c.getPhoneStatus() == status).collect(Collectors.toList());
}
}
