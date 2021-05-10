package com.jumia.countryphoneapp.dto;

import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FilterDto {

    private Country country;
    private PhoneStatus status;
}
