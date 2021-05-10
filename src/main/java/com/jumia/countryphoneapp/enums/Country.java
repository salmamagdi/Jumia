package com.jumia.countryphoneapp.enums;

import lombok.Getter;

@Getter
public enum Country {

    CAMEROON("Cameroon","^\\(237\\).*$", "\\(237\\)\\ ?[2368]\\d{7,8}$"),
    ETHIOPIA("Ethiopia","^\\(251\\).*$", "\\(251\\)\\ ?[1-59]\\d{8}$"),
    MOROCCO("Morocco","^\\(212\\).*$", "\\(212\\)\\ ?[5-9]\\d{8}$"),
    MOZAMBIQUE("Mozambique","^\\(258\\).*$", "\\(258\\)\\ ?[28]\\d{7,8}$"),
    UGANDA("Uganda","^\\(256\\).*$", "\\(256\\)\\ ?\\d{9}$");

    private String countryName;
    private String codeRgx;
    private String phoneRgx;

    Country(String countryName, String codeRgx, String phoneRgx) {
        this.countryName = countryName;
        this.codeRgx = codeRgx;
        this.phoneRgx = phoneRgx;
    }


    public static Country getCountryByPhone(String phone) {
        for (Country country : Country.values()) {
            if (phone.matches(country.getCodeRgx())) {
                return country;
            }
        }
        return null;
    }
}
