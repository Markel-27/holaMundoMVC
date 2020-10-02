/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import holamundo.controller.Controller;
import holamundo.model.ModelFactory;
import holamundo.view.ViewFactory;
import holamundo.view.InterfaceView;
/**
 *
 * @author markel
 */
public class Application {

    /**This is the application class for the hello world MVC app
     * @param args the command line arguments
     */
        public static void main(String[] args){
        // TODO code application logic here
        ModelFactory miFactoriaModelo = new ModelFactory();
        ViewFactory miFactoriaVista = new ViewFactory();
       
        Controller miControlador;
        miControlador = new Controller();
        
        miControlador.run(miFactoriaVista.getView(),miFactoriaModelo.getModel());
    //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
                }
}
