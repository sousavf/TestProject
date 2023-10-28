package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Student {

    private PersonalData personalData;
    private Address address;

    // Method one with static method
    public static Student clone(Student student) {
        return Student.builder()
                .personalData(PersonalData.clone(student.getPersonalData()))
                .address(Address.clone(student.getAddress()))
                .build();
    }

    // Method two with non-static method
    public Student copy() {
        return Student.builder()
                .personalData(this.personalData.copy())
                .address(this.address.copy())
                .build();
    }

}
