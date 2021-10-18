package com.company;

public class F extends E {
    protected String f;

    public F(String a, X x, String b, String c, String d, String e, String f) {
        super(a, x, b, c, d, e);
        this.f = f;
    }

    public String getF() {
        return f + " " + getE();
    }
}