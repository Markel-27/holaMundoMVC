/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

/**
 * Esta clase es una factoria para crear objetos de el modelo.
 * @author markel
 * @author moroni
 */
public class ModelFactory{
    /**
     * 
     * Se retorna un nuevo modelo. Al ser polimorfismo devuelve una nueva instancia de la clase ModelImplementation
     */
     public static Model getModel(){
        return new ModelImplementation();
    }
}
