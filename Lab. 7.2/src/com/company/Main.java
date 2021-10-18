package com.company;

public class Main {

    public static void main(String[] args) {
	    Hospital A = new Hospital("A", "Stefan cel mare", 9090909);
	    Departament<Staff> alpha = new Departament<Staff>("alpha");
	    A.addDepartament(alpha);
	    A.printDepartament();
	    alpha.addStaff(new Staff("Doctor","Alexandru","Mazureac","Iurie","11.02.11",'M',"sddss",123,"123","asd","asd","english"));
	    A.departaments.get(0).printStaff();
    }
}
