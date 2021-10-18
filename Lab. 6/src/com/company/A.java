package com.company;

public class A {
    protected String a;
    protected X x = new X("blablabla"); // nu se schimba nimic

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public String getA() {
        return a + " " + x.getX();
    }
}
