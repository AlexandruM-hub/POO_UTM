package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cube cub = new Cube(3d,3d,3d);
        Sfera sfera = new Sfera(1d,Math.PI);
        Parallelepiped para = new Parallelepiped(1d,2d,3d);
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
        geometricBodies.add(sfera);
        geometricBodies.add(cub);
        geometricBodies.add(para);

        for(GeometricBody t : geometricBodies){
            System.out.println("Suprafata:");
            System.out.println(t.getSurface());
            System.out.println("Volum:");
            System.out.println(t.getVolume());
        }

        GeometricBody maxVolumeObj = GeometricBodyControl.BiggestVolume(geometricBodies); // primim obiectul cu volumul cel mai mare
        GeometricBody maxAriaObj = GeometricBodyControl.BiggestAria(geometricBodies); // primim obiectul cu aria cea mai mare
    }
}
