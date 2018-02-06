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
public class TheCount {
    private int hisNumber;
    
    public String getNumber(){
        String CountSaying = Integer.toString(hisNumber) + "! A-HA-HA-HA";
        hisNumber++;
        return CountSaying;
        
    }
    
    public void setNumber(int x){
        hisNumber = x;
    }
    
}
