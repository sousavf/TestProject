package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String streetName;
    private String postalCode;
    private String country;

    public static Address clone(Address address) {
        return Address.builder()
                .streetName(address.getStreetName())
                .postalCode(address.getPostalCode())
                .country(address.getCountry())
                .build();
    }

    public Address copy() {
        return Address.builder()
                .streetName(String.valueOf(streetName))
                .postalCode(String.valueOf(postalCode))
                .country(String.valueOf(country))
                .build();
    }

}
