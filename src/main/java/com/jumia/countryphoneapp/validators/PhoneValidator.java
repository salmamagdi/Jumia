package com.jumia.countryphoneapp.validators;

import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;

public class PhoneValidator {
    public static PhoneStatus isValid(Country country, String phone) {
        if (country != null && phone != null && phone.matches(country.getPhoneRgx())) {
            return PhoneStatus.VALID;
        }
        return PhoneStatus.INVALID;
    }
}
