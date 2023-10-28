package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PersonalData implements Copyable<PersonalData> {

    private String name;
    private String surname;
    private String dateOfBirth;

    public PersonalData copy() {
        return PersonalData.builder()
                .name(String.valueOf(name))
                .surname(String.valueOf(surname))
                .dateOfBirth(String.valueOf(dateOfBirth))
                .build();
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
