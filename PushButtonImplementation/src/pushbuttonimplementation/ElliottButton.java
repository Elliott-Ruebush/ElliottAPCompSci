/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OEIAJWIEA;


/**
 * REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
 * @author ruebush.elliott
 */


//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
//import javafx.stage.Stage;
import javax.swing.*;
//import java.awt.*;
import java.io.IOException;


/**
 * MY BUTTON IS AN APPLICATION...!
 *
 * HAHA, 9PM ELLIOTT THOUGHT THAT %&$# WOULD WORK, HE WAS A %$#@ing idiot
 */
public class ElliottButton implements PushButton {

    String state;
//    Stage screwGoodPractice;


    @Override
    public void push() {
        JEditorPane litty = new JEditorPane();
        litty.setEditable(false);

        try {
            int reply = JOptionPane.showConfirmDialog(null, "How futuristic are you? Are you running JAVA 1.3?", "IF YOU SAY YES YOU'RE NOT A REAL MAN", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                String yourURL;
                yourURL = JOptionPane.showInputDialog("ENTER AN EXACT COPY AND PASTED URL (AND PREPARE FOR NO SUPPORT BEYOND LIKE HTML 2 OR SOMETHING LIKE THAT BECAUSE IT TURNS OUT JAVAFX WEBVIEW DOESNT WORK WITHOUT A MAIN METHOD NO MATTER HOW MANY BEST PRACTICES YOU BREAK [YEAH NO DUH BRO......])");
                this.state = yourURL;
                litty.setPage(yourURL);
            }
            else {
                JOptionPane.showMessageDialog(null, "YOU SAID NO HAHAHAH, Good for you mah dude (PS: IS YOUR NAME DR. BROWN?!?!?");
                System.exit(0);
            }

        }
        catch (IOException e) {
            litty.setContentType("text/html");
            litty.setText("<html><h1>COULDNT LOAD YO STUFF BECAUSE YOU DIDNT ENTER A PERFECT URL</h1></html>");
        }

        JScrollPane scrollPane = new JScrollPane(litty);
        JFrame BLEH = new JFrame("AYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY LMAO");
        // THIS NEXT LINE REQUIRES JAVA 1.3, ARE YOU THAT UP TO DATE
        BLEH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BLEH.getContentPane().add(scrollPane);
        BLEH.setSize(1920, 1080);
        //YEAH THE METHOD IS DEPRECATED BUT WE BACK IN 1856
        BLEH.show();
    }

    @Override
    public String buttonState() {
        System.out.println("Returning the URL THAT WAS ENTERED EARLIER, DEFAULT IS https://www.google.com");
        return state;
    }

//    public class AnAppIsHere extends Application {
//        @Override
//        public void start(final Stage stage) {
//            StackPane root = new StackPane();
//            WebView browser = new WebView();
//            WebEngine webEngine = browser.getEngine();
//            webEngine.load("https://google.com");
//
//            root.getChildren().add(browser);
//            Scene scene = new Scene(root, 800, 600);
//            stage.setScene(scene);
//            stage.show();
//        }
//
//        public void main(String[] args) {
//            Application.launch();
//        }
//    }
}
