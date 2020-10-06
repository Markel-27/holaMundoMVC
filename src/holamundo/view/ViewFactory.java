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
public class ViewFactory {
    
    /**
     * Coge el getView y se lo manda al ViewImplementation
     * @return 
     */
    public static View getView(){
        return new InterfaceView();
    }
    
}
