package com.company;
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
        String a = new String();
        text.toLowerCase();
        text.replaceAll("[.!,?]","");
        String[] tokens = text.split(" ");
        List<String> aux = new ArrayList<>(Arrays.asList(tokens));
        System.out.println("\nCuvintele cele mai des intalnite sunt:");
        for( int k = 0 ; k < 5 ; k++ ) {
            for (int i = 0; i < aux.size(); i++) {
                int freq = Collections.frequency(aux, tokens[i]);
                if(freq > max){
                    max=freq;
                    a=tokens[i];
                }
                if(i == aux.size()-1){
                    System.out.println((k+1)+". " + a + " -> intilnit de " + max);
                    aux.removeAll(Collections.singleton(a));
                    max=0;
                }
            }
        }
    }
}