/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

/**
 * view implementation show the interface in text
 * @author markel
 * @author moroni
 */
public class ViewImplementation implements View{
    /**
     * Muestra el saludo que hemos cogido antes del archivo
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
            
}
