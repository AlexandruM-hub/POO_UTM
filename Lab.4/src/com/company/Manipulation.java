package com.company;

import jdk.jfr.Frequency;

import java.util.*;

public class Manipulation {
    public void NumberOf(String text) {
        int nrProp = 0;
        int nrCuvinte = 0;
        int nrLitere = 0;
        int nrVocale = 0;
        int nrConsoane = 0;
        text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if (ch == '.'  || ch == '?' || ch == '!') {
                nrProp++;
            }
            if (ch == ' ') {
                nrCuvinte++;
            }
            if ((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
                nrLitere++;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                nrVocale++;
            } else {
                nrConsoane++;
            }
        }
        System.out.println("Numarul propozitiile = " + nrProp);
        System.out.println("Numarul cuvintelor = " + nrCuvinte);
        System.out.println("Numarul literelor este= " + nrLitere);
        System.out.println("Numarul voacalelor = " + nrVocale);
        System.out.println("Numarul consoanelor = " + nrConsoane);
    }

    public void topWords(String text) {
        int max = 0;
        text.toLowerCase();
        text.replaceAll("[.!,?]","");
        String[] tokens = text.split(" ");
        ArrayList<String> arr = new ArrayList<String>();
        int[][] repCount = new int[2][tokens.length];
        List<String> aux = Arrays.asList(tokens);
        for (int i = 0; i < tokens.length; i++) {
            if (arr.contains(tokens[i])){
                continue;
            }
            else{
                int freq = Collections.frequency(aux, tokens[i]);
                repCount[0][i] = freq;
                repCount[1][i] = i;
                arr.add(tokens[i]);
            }
        }
        for (int i = 0; i < tokens.length - 1; i++) {
            for (int k = i + 1; k < tokens.length; k++) {
                if (repCount[0][i] < repCount[0][k]) {
                    for (int j = 0; j < 2; j++) {
                        int z = repCount[j][i];
                        repCount[j][i] = repCount[j][k];
                        repCount[j][k] = z;

                    }
                }
            }
        }
        System.out.println("Cuvintele cu cele mai multe repetari sunt:");
        for(int i=0;i < 5;i++){
            System.out.println(tokens[repCount[1][i]] + " cu "+ repCount[0][i] + " repetari");
        }
    }
}