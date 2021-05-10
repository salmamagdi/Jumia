package com.jumia.countryphoneapp.mapper;

import com.jumia.countryphoneapp.dto.CustomerDto;
import com.jumia.countryphoneapp.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto convertToDto(Customer customer);
}
