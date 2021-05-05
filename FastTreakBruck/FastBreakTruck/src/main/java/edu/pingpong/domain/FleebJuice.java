package edu.pingpong.domain;

import edu.pingpong.types.Bebida;

public class FleebJuice extends Bebida {
    private final String nombre = "FleebJuice";
    private final Float pvp = 35f;

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Float PVP() {
        return pvp;
    }
}
