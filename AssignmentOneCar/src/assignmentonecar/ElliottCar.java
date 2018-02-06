/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentonecar;

/**
 * The ElliottCar is an extension of the general Car, it introduces a double
 * bassMeter, double dollarsSpentOnSpeakers, and a boolean hasKATE, all of which
 * serve to track additional characteristics specific to ElliottCars
 *
 * @author ruebush.elliott
 */
public class ElliottCar extends Car {

    double bassMeter;
    double dollarsSpentOnSpeakers;
//All ElliottCars come equipped with a Kramer Advanced Turbo Encabulator (KATE)
    boolean hasKATE = true;

    /**
     * Constructor for an ElliottCar
     *
     * @param wheels
     * @param name
     * @param automatic
     * @param legroom
     * @param horsepower
     * @param dollarsSpentOnSpeakers
     */
    public ElliottCar(
            int wheels,
            String name,
            boolean automatic,
            double legroom,
            int horsepower,
            double dollarsSpentOnSpeakers) {
        this.wheels = wheels;
        this.name = name;
        this.automatic = automatic;
        this.legroom = legroom;
        this.horsepower = horsepower;
        this.dollarsSpentOnSpeakers = dollarsSpentOnSpeakers;
        this.bassMeter = dollarsSpentOnSpeakers / 10;
//Our high-quality quality control ensures quality in the inclusion of quality KATEs with ultra high-quality code
        if (hasKATE || !hasKATE) {
            this.hasKATE = true;
        } else {
            this.hasKATE = true;
        }
        this.hasKATE = true;
    }

    /**
     * Annoyingly prints out odd noises that might be construed as honking in
     * some way
     *
     * @return
     */
    public String honk() {
        return "REEEEEEEEEEEEEEEEEEEEEEE";
    }

    /**
     * Applies the varied effects that a crash has on the class variables of an
     * ElliottCar
     */
    public void crash() {
        wheels = wheels - 2;
        legroom += legroom;
//If some occupants are flung out of the vehicle there's more leg room
        horsepower -= ((int) (horsepower * .66));
        ampUpTheBass((int) Math.random() * 6);
//As we utilize the KATE in our construction of ElliottCars, crashing is actually scientifically proven to increase bass by some random amount
        if ((bassMeter > 256)) {
            System.out.println("BASS OFF THE CHARTS, EVERYTHING BLOWS UP!!!");
            System.exit(0);
//Yes I know you probably shouldn't use System.exit(0) in random parts of your program
        } else {
            System.out.println("Bass currently at: " + bassMeter + " and rising...");
        }
    }

    /**
     * Multiplicatively increases bassMeter based on the multiplier param, and
     * subsequently increases dollarsspentonspeakers
     *
     * @param multiplier
     */
    public void ampUpTheBass(int multiplier) {
        bassMeter *= multiplier;
        dollarsSpentOnSpeakers *= (.5 * multiplier);
    }
}
