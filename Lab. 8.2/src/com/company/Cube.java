package com.company;

public class Cube extends GeometricBody{
    public Cube(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getSurface() {
        return 2*(a*b+a*c+b*c);
    }

    @Override
    public double getVolume() {
        return a*b*c;
    }
}
