package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Address address = Address.builder()
                .streetName("Test Street")
                .postalCode("1234")
                .country("Portugal")
                .build();

        PersonalData personalData = PersonalData.builder()
                .name("John")
                .surname("Wick")
                .dateOfBirth("02/09/1964")
                .build();

        Student student = Student.builder()
                .address(address)
                .personalData(personalData)
                .build();

        Student studentCopy = CopyFactory.of(student);

        student.getPersonalData().setName("ModifiedName");
        student.getPersonalData().setSurname("ModifiedSurname");
        student.getPersonalData().setDateOfBirth("ModifiedDateOfBirth");
        student.getAddress().setStreetName("ModifiedStreetName");
        student.getAddress().setPostalCode("ModifiedPostalCode");
        student.getAddress().setCountry("ModifiedCountry");
        System.out.println(student);
        System.out.println(studentCopy);

    }
}