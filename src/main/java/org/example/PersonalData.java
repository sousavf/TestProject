package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PersonalData {

    private String name;
    private String surname;
    private String dateOfBirth;

    public static PersonalData clone(PersonalData personalData) {
        return PersonalData.builder()
                .name(personalData.getName())
                .surname(personalData.getSurname())
                .dateOfBirth(personalData.getDateOfBirth())
                .build();
    }

    public PersonalData copy() {
        return PersonalData.builder()
                .name(String.valueOf(name))
                .surname(String.valueOf(surname))
                .dateOfBirth(String.valueOf(dateOfBirth))
                .build();
    }

}
