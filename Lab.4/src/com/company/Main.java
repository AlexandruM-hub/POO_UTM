package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test = "Literary critics, historians, avid readers, and even casual readers will all have different opinions on which novel is truly the “greatest book ever written.” Is it a novel with beautiful, captivating figurative language? Or one with gritty realism? A novel that has had an immense social impact? Or one that has more subtly affected the world? Here is a list of 12 novels that, for various reasons, have been considered some of the greatest works of literature ever written.";
        new Manipulation().NumberOf(test);
        new Manipulation().topWords(test);
    }
}
