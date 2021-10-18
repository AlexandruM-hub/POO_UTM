package com.company;

public class Doctor extends operations_staff{
    private String speciality;
    private String locations;

    public Doctor(String title, String givenName, String middleName, String familyName, String birthDate, char gender, String homeAddress, int phone, String joined, String education, String certification, String languages, String speciality, String locations) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
        this.speciality = speciality;
        this.locations = locations;
    }
}
