package com.company;


public class Main {
    public static void main(String[] args) {
        String test = "Literary critics, historians, avid readers, and even casual readers will all have different opinions on which novel is truly the “greatest book ever written.” Is it a novel with beautiful, captivating figurative language? Or one with gritty realism? A novel that has had an immense social impact? Or one that has more subtly affected the world? Here is a list of 12 novels that, for various reasons, have been considered some of the greatest works of literature ever written.";
        System.out.println("Numarul propozitiile = " + Manipulation.NrProp(test));
        System.out.println("Numarul cuvintelor = " + Manipulation.NrCuvinte(test));
        System.out.println("Numarul literelor este= " + Manipulation.nrLitere(test));
        System.out.println("Numarul voacalelor = " + Manipulation.nrVocale(test));
        System.out.println("Numarul consoanelor = " + Manipulation.nrConsoane(test));
        Manipulation.topWords(test);
    }


}
