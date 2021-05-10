package com.jumia.countryphoneapp.controller;


import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.service.CustomerServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerController {

        @Autowired
        CustomerServiceImpl customerServiceImpl;

    @ApiOperation(value = "This method used to Get customer phone data")
    @ApiImplicitParam(name = "customerDto", required = true, dataType = "CustomerDto" , paramType = "body")
    @ApiResponse(code = 200, message = "ResponseEntity return successfully")
    @CrossOrigin
    @PostMapping(value = "/getFilterCustomersData")
    public @ResponseBody ResponseEntity<CustomerDto> getFilterCustomersData(@RequestBody CustomerDto customerDto) {
        List<CustomerDto> response = new ArrayList<CustomerDto>();
        try {
            response = customerServiceImpl.findAllOrBYCountryAndStatus(customerDto.getCountry(),customerDto.getPhoneStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity(response, HttpStatus.OK);

    }


}
