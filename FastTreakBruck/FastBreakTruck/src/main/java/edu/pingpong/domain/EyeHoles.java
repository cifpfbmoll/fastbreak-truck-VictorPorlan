package edu.pingpong.domain;

import edu.pingpong.types.Cereales;

public class EyeHoles extends Cereales {
    private final String nombre = "Eyeholes";
    private final Float pvp = 25f;

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Float PVP() {
        return pvp;
    }
}
