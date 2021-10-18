package com.company;

public class H extends G{
    protected String h;

    public H(String a, X x, String b, String c, String d, String e, String f, String g, String h) {
        super(a, x, b, c, d, e, f, g);
        this.h = h;
    }

    public String getH() {
        return h + " " + getG();
    }
}
