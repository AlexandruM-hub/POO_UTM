package com.company;

public class Parallelepiped extends GeometricBody{
    public Parallelepiped(double a, double b, double c) {
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
