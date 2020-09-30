/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

/**
 * Esta clase es una factoria para crear objetos de el modelo.
 * @author Endika Ubierna Lopez
 */
public class ModelFactory{
    /**
     * 
     * @return Retorna un nuevo modelo. El tipo que devuelve es la interfaz pero en realidad por polimorfismo 
     * devuelve una nueva instancia de la clase ModelImplementation
     */
     public static Model getModel(){
        return new ModelImplementation();
    }
}
