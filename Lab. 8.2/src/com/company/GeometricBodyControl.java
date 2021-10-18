package com.company;

import java.util.ArrayList;

public class GeometricBodyControl {

    static public GeometricBody BiggestVolume(ArrayList<GeometricBody> geometricBodies){
        double maxVolume=0.d;
        GeometricBody aux = null;
        for (GeometricBody t : geometricBodies){
            if(t.getVolume() > maxVolume){
                maxVolume = t.getVolume();
                aux = t;
            }
        }
        return aux;
    }

    static public GeometricBody BiggestAria(ArrayList<GeometricBody> geometricBodies){
        double maxAria=0.d;
        GeometricBody aux = null;
        for (GeometricBody t : geometricBodies){
            if(t.getSurface() > maxAria){
                maxAria = t.getSurface();
                aux = t;
            }
        }
        return aux;
    }

}
