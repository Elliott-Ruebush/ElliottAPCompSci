/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushbuttonimplementation;


/**
 *
 * @author ruebush.elliott
 */
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
public class ElliottButton implements PushButton{

    String state;
    
    @Override
    public void push() {
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://google.com");
    }

    @Override
    public String buttonState() {
        return state;
    }
    
}
