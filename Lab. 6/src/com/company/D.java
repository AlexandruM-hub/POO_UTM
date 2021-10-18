package com.company;

public class D extends C {
    protected String d;

    public D(String a, X x, String b, String c, String d) {
        super(a, x, b, c);
        this.d = d;
    }

    public String getD() {

        return d + " " + getC();
    }
}