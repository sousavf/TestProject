package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Student implements Copyable<Student> {

    private PersonalData personalData;
    private Address address;

    // Method two with non-static method
    public Student copy() {
        return Student.builder()
                .personalData(CopyFactory.of(personalData))
                .address(CopyFactory.of(address))
                .build();
    }

    @Override
    public String toString() {
        return "Student{" +
                "personalData=" + personalData +
                ", address=" + address +
                '}';
    }
}
