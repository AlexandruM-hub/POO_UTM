package com.company;
import java.util.*;

public class Manipulation {

    static public int NrProp(String text){
        int nrProp = 0;
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if (ch == '.'  || ch == '?' || ch == '!') {
                nrProp++;
            }
        }
        return nrProp;
    }
    
    static public int nrVocale(String text){
        int nrVocale = 0;
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                nrVocale++;
            }
        }
        return nrVocale;
    }
    
    static public int nrConsoane(String text){
        int nrConsoane = 0;
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && ((ch > 64 && ch < 91) || (ch > 96 && ch < 123))) {
                nrConsoane++;
            }
        }
        return nrConsoane;
    }
    
    static public int NrCuvinte(String text){
        int NrCuvinte = 0;
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if (ch == ' ') {
                NrCuvinte++;
            }
        }
        return NrCuvinte;
    }
    
    static public int nrLitere(String text){
        int nrLitere = 0;
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            if ((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
                nrLitere++;
            }
        }
        return nrLitere;
    }

    static public void topWords(String text) {
        int max = 0;
        String a = null;
        text = text.toLowerCase();
        text = text.replaceAll("[.!,?]","");
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