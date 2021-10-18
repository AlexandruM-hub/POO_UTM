package com.company;

import java.util.Date;

public class Patient extends Person{
    private String id;
    private int age;
    private Date accepted;
    private String history;
    private String prescriprions;
    private String allergies;
    private String specialReqs;

    public Patient(String title, String givenName, String middleName, String familyName, String birthDate, char gender, String homeAddress, int phone, String id, int age, Date accepted, String history, String prescriprions, String allergies, String specialReqs) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.age = age;// Trebuie de modificat!
        this.accepted = accepted;
        this.history = history;
        this.prescriprions = prescriprions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPrescriprions() {
        return prescriprions;
    }

    public void setPrescriprions(String prescriprions) {
        this.prescriprions = prescriprions;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSpecialReqs() {
        return specialReqs;
    }

    public void setSpecialReqs(String specialReqs) {
        this.specialReqs = specialReqs;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
