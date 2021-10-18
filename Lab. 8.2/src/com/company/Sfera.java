package com.company;

public class Sfera extends GeometricBody{
    public Sfera(double a, double c) {
        super(a, c);
    }

    @Override
    public double getSurface() {
        return a*a*c;
    }

    @Override
    public double getVolume() {
        return (4*c*a*a*a)/3;
    }
}
