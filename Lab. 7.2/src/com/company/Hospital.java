package com.company;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String address;
    private int phone;
    ArrayList<Departament<Staff>> departaments = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public Hospital(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public boolean addPatient(Patient newPatient){
        if(patients.contains(newPatient)){
            System.out.println("Patient already exists");
            return false;
        }
        else{
            patients.add(newPatient);
            System.out.println(newPatient.getName() + " was successfully added.");
            return true;
        }
    }

    public boolean addDepartament(Departament<Staff> newDepartament){
        if(departaments.contains(newDepartament)){
            System.out.println("Departament already exists");
            return false;
        }
        else{
            departaments.add(newDepartament);
            System.out.println(newDepartament.getName()+ " was successfully added.");
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void printDepartament(){
        System.out.println("Departaments:");
        for(Departament<Staff> t:departaments){
            System.out.println(t.getName());
        }
    }
}
