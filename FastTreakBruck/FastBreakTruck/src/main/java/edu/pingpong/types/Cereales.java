package edu.pingpong.types;

import edu.pingpong.domain.Caja;
import edu.pingpong.behaviour.Item;
import edu.pingpong.behaviour.Packing;

public abstract class Cereales implements Item {
    public Cereales() {
    }

    @Override
    public Packing empaquetado() {
            return new Caja();
    }

    @Override
    public String toString() {
        return "Item:" + nombre() +", Empaquetado:" + this.empaquetado().envoltorio() + ", Precio:" + PVP();
    }

}
