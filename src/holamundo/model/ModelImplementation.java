/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelImplementation implements Model{
    /**
     * 
     * @param greeting 
     */
    
    
    @Override
    public void getGreeting(String greeting){
  
       ResourceBundle miResource = ResourceBundle.getBundle("almacen.greeting.properties");
       greeting = miResource.getString("greeting");
       System.out.println(greeting);
    } 
    
}
 