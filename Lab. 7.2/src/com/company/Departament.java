package com.company;

import java.util.ArrayList;

public class Departament<T extends Staff> {
    private String name;
    ArrayList<T> staff = new ArrayList<>();

    public Departament(String name) {
        this.name = name;
    }

    public boolean addStaff(T newStaff){
        if(staff.contains(newStaff)){
            System.out.println("This person already exist in this departament.");
            return false;
        }
        else{
            staff.add(newStaff);
            System.out.println(newStaff.getName()+ " was added successfully!");
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void printStaff(){
        System.out.println("Staff in current departament:");
        for (T t : staff){
            System.out.println(t.getName());
        }
    }
}
