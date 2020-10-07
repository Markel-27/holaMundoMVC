
package holamundo.view;

import javax.swing.JLabel;

/*
 * @author pocoy
 */
public class InterfaceView extends javax.swing.JFrame implements View {

    /* Creates new form InterfaceView
     */

    @Override
    public void showGreeting(String greeting){
        JLabel label = new JLabel(greeting);
        getContentPane().add(label);
        label.setSize(100,100);
        setVisible(true);
    }
    // Variables declaration - do not modify
    // End of variables declaration
}