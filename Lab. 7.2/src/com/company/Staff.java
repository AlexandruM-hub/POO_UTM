package com.company;

public class Staff extends Person{
    private String joined;
    private String education;
    private String certification;
    private String languages;

    public Staff(String title, String givenName, String middleName, String familyName, String birthDate, char gender, String homeAddress, int phone, String joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public String getJoined() {
        return joined;
    }

    public String getEducation() {
        return education;
    }

    public String getCertification() {
        return certification;
    }

    public String getLanguages() {
        return languages;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
