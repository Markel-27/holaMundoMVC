/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

/**
 * Contains view methods for being used by a controller 
 * @author markel 
 */
public interface View {
    /**
     * Shows a greeting in UI
     * @param greeting A string contains the greeting to be shown
     */
    public void showGreeting (String greeting);
    
}
