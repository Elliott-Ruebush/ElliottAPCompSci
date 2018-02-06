/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwotrolls;

/**
 *
 * @author ruebush.elliott
 */
public class ElliottTroll {
    private double personalAmount;
    private static double totalAmountCollected;
    
    /**
     * Adds the specified amount of money to both the individual troll object 
     * collecting the money and to the total amount of money collected.
     */
    public void collect(double x) {
        this.personalAmount += x;
        totalAmountCollected += x;
    }
    
    /**
     * Returns the amount of money that a single troll object possesses
     * @return personalAmount 
     */
    public double myMoney(){
        return this.personalAmount;
    }
    
    /**
     * Returns the current total amount of money collected
     * @return totalAmountcollected
     */
    public static double treasury(){
        return totalAmountCollected;
    }
    
    /**
     * Sets the total amount collected equal to 0
     */
    public static void emptyTreasury(){
        totalAmountCollected = 0;
    }
    
}
