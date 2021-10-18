package com.company;

public abstract class GeometricBody implements IGeometricBody {
    protected double a;
    protected double b;
    protected double c;

    public GeometricBody(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public GeometricBody(double a, double c) {
        this.a = a;
        this.c = c;
    }

    public abstract double getSurface();
    public abstract double getVolume();
}
