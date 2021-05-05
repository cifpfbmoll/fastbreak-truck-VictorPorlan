package edu.pingpong.behaviour;

import edu.pingpong.domain.*;

public class FastBreakTruck{
    public FastBreakTruck() {
    }
    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new EyeHoles());
        desayuno.addItem(new TurbulentJuice());

        return desayuno;
    }
    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());

        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno) {
        desayuno.addItem(new Plumbus());
    }
}
