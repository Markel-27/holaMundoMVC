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
    public String getGreeting(){
  
       ResourceBundle miResource = ResourceBundle.getBundle("almacen.greeting");
       String greeting = miResource.getString("greeting");
       return greeting;
    } 
    
}
 