package com.jumia.countryphoneapp;

import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.entities.Customer;
import com.jumia.countryphoneapp.mapper.CustomerMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MapperTest {

    @Test
void EntityToDto(){

        Customer customer = Customer.builder().id(1l).name("test").phone("((251) 91111111111").build();


        CustomerDto customerDtoResponse = CustomerMapper.INSTANCE.convertToDto(customer);
        assertEquals(customer.getId(), customerDtoResponse.getId());
        assertEquals(customer.getName(), customerDtoResponse.getName());
        assertEquals(customer.getPhone(), customerDtoResponse.getPhone());
        assertNull(customerDtoResponse.getCountry());
        assertNull(customerDtoResponse.getPhoneStatus());
    }



}
