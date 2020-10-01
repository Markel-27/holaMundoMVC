/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.controller;

import holamundo.model.Model;
import holamundo.view.View;

/**
 * Esta clase contiene al controlador de mi aplicacion, esta trabaja con ambas interfaces.
 * @author markel
 * @author moroni
 */
public class Controller{
    /**
     * El run ejecuta el getGreeting y el showGreeting de la vista para luego usarlo en la aplicacion
     * @param vista Una vista, tenemos una clase que implementa la interfaz vista.
     * @param modelo Un modelo, tenemos una clase que implementa la interfaz modelo.
     */
    public void run(View vista,Model modelo){
        String saludo;
        saludo = modelo.getGreeting();
        vista.showGreeting(saludo);
    }
}
