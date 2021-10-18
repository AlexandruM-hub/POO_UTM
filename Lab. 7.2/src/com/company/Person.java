package com.company;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String name;
    private String birthDate;
    private char gender;
    private String homeAddress;
    private int phone;

    public Person(String title, String givenName, String middleName, String familyName, String birthDate, char gender, String homeAddress, int phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = this.givenName + " " + this.middleName + " " + this.familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public int getPhone() {
        return phone;
    }

}
