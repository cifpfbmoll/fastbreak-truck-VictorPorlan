package edu.pingpong.domain;

import edu.pingpong.types.Bebida;

public class TurbulentJuice extends Bebida {
    private final String nombre = "TurbulentJuice";
    private final Float pvp = 30f;

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Float PVP() {
        return pvp;
    }
}
