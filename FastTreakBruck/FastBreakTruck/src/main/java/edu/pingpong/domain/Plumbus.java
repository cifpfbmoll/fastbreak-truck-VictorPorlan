package edu.pingpong.domain;

import edu.pingpong.types.Juguete;

public class Plumbus extends Juguete {
    private final String nombre = "Plumbus";
    private final Float pvp = 100f;
    public Plumbus() {
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public Float PVP() {
        return this.pvp;
    }
}
