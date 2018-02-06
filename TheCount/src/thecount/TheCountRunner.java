/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecount;

/**
 *
 * @author ruebush.elliott
 */
public class TheCountRunner {

    public static void Main() {
        TheCount myCount = new TheCount();
        myCount.setNumber(1);
        System.out.println(myCount.getNumber());
        System.out.println(myCount.getNumber());
    }
}
/* Expected output:
 1! A-HA-HA!
 2! A-HA-HA!
 */
/* Okay, you COULD write the main function inside of TheCount, but
 it’s considered REALLY SLOPPY */
