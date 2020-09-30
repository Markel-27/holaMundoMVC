/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
  /* public ViewImplementation getView() {//ESTA MAL TIENE QUE DEVOLVER LA INTERFAZ NO LA CLASE POLIMORFISMO
            return new ViewImplementation();
    }*/
    
    /**
     * 
     * @return 
     */
    public static View getView(){
        return new ViewImplementation();
    }
    
}
