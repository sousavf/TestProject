package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address implements Copyable<Address> {

    private String streetName;
    private String postalCode;
    private String country;

    public Address copy() {
        return Address.builder()
                .streetName(String.valueOf(streetName))
                .postalCode(String.valueOf(postalCode))
                .country(String.valueOf(country))
                .build();
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
