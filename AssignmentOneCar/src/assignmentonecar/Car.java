/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentonecar;

/**
 *
 * @author ruebush.elliott
 */
public class Car {
    int wheels;
    String name;
    boolean automatic;
    double legroom;
    int horsepower;
    
    public Car() {
        wheels = 4;
        name = "Betty";
        automatic = true;
        legroom = 5.7;
        horsepower = 150;
    }
    
    public String honk() {
        return "default honk";
    }
    
    public void crash() {
        wheels --;
        legroom *= 0.95;
        horsepower = horsepower - 5;
    }
    
    public int getWheels() {return wheels;}
    public double getLegroom() {return legroom;}
    public int getHP() {return horsepower;}
    
}
