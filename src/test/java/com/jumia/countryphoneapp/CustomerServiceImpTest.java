package com.jumia.countryphoneapp;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import com.jumia.countryphoneapp.controller.CustomerController;
import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.entities.Customer;
import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;
import com.jumia.countryphoneapp.repositories.CustomerRepository;
import com.jumia.countryphoneapp.service.CustomerService;
import com.jumia.countryphoneapp.service.CustomerServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CustomerServiceImpTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl ;

    @Mock
    private CustomerService customerService ;
    @InjectMocks
    private CustomerController customerController ;

    @Test
    void test_customerService_findAllOrBYCountryAndStatusValid() {
        when(customerRepository.findAll()).thenReturn(getCustomerEntityValid());
        List<CustomerDto> customersDto = customerServiceImpl.findAllOrBYCountryAndStatus(null,null );
        assertNotNull(customersDto);
        assertNotNull(customersDto.get(0).getId());
        assertEquals(getCustomerEntityValid().get(0).getId(), customersDto.get(0).getId());
        assertEquals(getCustomerEntityValid().get(0).getName(), customersDto.get(0).getName());
        assertEquals(getCustomerEntityValid().get(0).getPhone(), customersDto.get(0).getPhone());
        assertNotNull(customersDto.get(0).getCountry());
        assertNotNull(customersDto.get(0).getPhoneStatus());

    }

    @Test
    void test_customerService_findAllOrBYCountryAndStatusInValid() {
        when(customerRepository.findAll()).thenReturn(getCustomerEntityInValid());
        List<CustomerDto> customersDto = customerServiceImpl.findAllOrBYCountryAndStatus(null,null );
        assertNotNull(customersDto);
        assertNotNull(customersDto.get(0).getId());
        assertEquals(getCustomerEntityInValid().get(0).getId(), customersDto.get(0).getId());
        assertEquals(getCustomerEntityInValid().get(0).getName(), customersDto.get(0).getName());
        assertEquals(getCustomerEntityInValid().get(0).getPhone(), customersDto.get(0).getPhone());
        assertNotNull(customersDto.get(0).getCountry());
        assertNotNull(customersDto.get(0).getPhoneStatus());

    }





    private List<Customer> getCustomerEntityValid(){
     final List<Customer> customersMocked = Arrays.asList(Customer.builder()
                     .id(1L)
                     .name("Tanvi Sachdeva")
                     .phone("(258) 849181828")
                     .build(),
             Customer.builder()
                     .id(2L)
                     .name("Yonatan Tekelay")
                     .phone("(251) 911168450")
                     .build());

     return customersMocked;
 }

    private List<Customer> getCustomerEntityInValid(){
        final List<Customer> customersMocked = Arrays.asList(Customer.builder()
                        .id(1L)
                        .name("Tanvi Sachdeva")
                        .phone("(258) 849181828")
                        .build(),
                Customer.builder()
                        .id(2L)
                        .name("Fanetahune Abaia")
                        .phone("(212) 691933626")
                        .build());

        return customersMocked;
    }

     private List<CustomerDto> getCustomerEntityCameroonValid(){
        final List<CustomerDto> customersMocked =  Arrays.asList(CustomerDto.builder()
                        .id(31L)
                        .name("EMILE CHRISTIAN KOUKOU DIKANDA HONORE")
                        .phone("(237) 697151594").country(Country.CAMEROON).phoneStatus(PhoneStatus.VALID)
                        .build(),
                CustomerDto.builder()
                        .id(32L)
                        .name("MICHAEL MICHAEL")
                        .phone("(237) 677046616").country(Country.CAMEROON).phoneStatus(PhoneStatus.VALID)
                        .build());

        return customersMocked;
    }


}
