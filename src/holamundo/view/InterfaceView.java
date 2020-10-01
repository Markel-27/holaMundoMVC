/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

/**
 *
 * @author markel
 * @author moroni
 */
import javax.swing.*;
import holamundo.view.View;
public class InterfaceView extends JFrame implements View{

    /**
     * Creates new form InterfaceView
     */
    public static void InterfaceViewUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("greeting");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void showGreeting(String greeting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
