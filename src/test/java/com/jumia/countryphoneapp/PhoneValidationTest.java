package com.jumia.countryphoneapp;

import com.jumia.countryphoneapp.enums.Country;
import com.jumia.countryphoneapp.enums.PhoneStatus;
import com.jumia.countryphoneapp.validators.PhoneValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneValidationTest {

    @Test
    void validPhoneStatus() {

         PhoneStatus MOZAMBIQUE = PhoneValidator.isValid(Country.MOZAMBIQUE, "(258) 847651504");
         PhoneStatus ETHIOPIA = PhoneValidator.isValid(Country.ETHIOPIA, "(251) 914148181");
         PhoneStatus MOROCCO = PhoneValidator.isValid(Country.MOROCCO, "(212) 691933626");
         PhoneStatus CAMEROON = PhoneValidator.isValid(Country.CAMEROON, "(237) 673122155");
         PhoneStatus UGANDA = PhoneValidator.isValid(Country.UGANDA, "(256) 714660221");

        assertEquals(PhoneStatus.VALID, MOZAMBIQUE);
        assertEquals(PhoneStatus.VALID, ETHIOPIA);
        assertEquals(PhoneStatus.VALID, MOROCCO);
        assertEquals(PhoneStatus.VALID, CAMEROON);
        assertEquals(PhoneStatus.VALID, UGANDA);
    }

    @Test
    void invalidPhoneStatus() {

        final PhoneStatus MOZAMBIQUE = PhoneValidator.isValid(Country.MOZAMBIQUE, "(258) 84330678235");
        final PhoneStatus ETHIOPIA = PhoneValidator.isValid(Country.ETHIOPIA, "(251) 9119454961");
        final PhoneStatus MOROCCO = PhoneValidator.isValid(Country.MOROCCO, "(212) 6007989253");
        final PhoneStatus CAMEROON = PhoneValidator.isValid(Country.CAMEROON, "(237) 6A0311634");
        final PhoneStatus UGANDA = PhoneValidator.isValid(Country.UGANDA, "(256) 7734127498");

        assertEquals(PhoneStatus.INVALID, MOZAMBIQUE);
        assertEquals(PhoneStatus.INVALID, ETHIOPIA);
        assertEquals(PhoneStatus.INVALID, MOROCCO);
        assertEquals(PhoneStatus.INVALID, CAMEROON);
        assertEquals(PhoneStatus.INVALID, UGANDA);
    }
}
