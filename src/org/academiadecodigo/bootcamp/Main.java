package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        MagicLamp lamp = new MagicLamp(3);
        MagicLamp lamp2 = new MagicLamp(3);

        Genie g1 = lamp.rubbLamp();
        Genie g2 = lamp.rubbLamp();
        Genie g3 = lamp.rubbLamp();
        Genie g4 = lamp.rubbLamp();

        Genie g5 = lamp2.rubbLamp();

        System.out.println("\n");

        g1.makeWish();
        g1.makeWish();

        System.out.println("\n");

        g4.makeWish();
        g4.makeWish();
        lamp.sacrificeDemon(g4);
        lamp.sacrificeDemon(g4);
        g4.makeWish();

        System.out.println("\n");

        lamp.compareLamps(lamp2);

    }
}
