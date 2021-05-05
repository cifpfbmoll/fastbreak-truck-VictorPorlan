package edu.pingpong.behaviour;

import edu.pingpong.domain.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FastBreakTruckTest {

    @Test
    public void eyeHolesTest() {
        assertEquals(2, FastBreakTruck.prepararEyeHoles().getLista().size());
        assertTrue(FastBreakTruck.prepararEyeHoles().getLista().stream().anyMatch(i -> i instanceof EyeHoles));
        assertTrue(FastBreakTruck.prepararEyeHoles().getLista().stream().anyMatch(i -> i instanceof TurbulentJuice));

    }

    @Test
    public void smigglesTest() {
        assertEquals(2, FastBreakTruck.prepararSmiggles().getLista().size());
        assertTrue(FastBreakTruck.prepararSmiggles().getLista().stream().anyMatch(i -> i instanceof Smiggles));
        assertTrue(FastBreakTruck.prepararSmiggles().getLista().stream().anyMatch(i -> i instanceof FleebJuice));

    }

    @Test
    public void incluirJugueteTest() {
        Desayuno eyeDes2 = FastBreakTruck.prepararEyeHoles();
        FastBreakTruck.incluirJuguete(eyeDes2);
        assertTrue(eyeDes2.getLista().stream().anyMatch(i -> i instanceof Plumbus));

    }
}