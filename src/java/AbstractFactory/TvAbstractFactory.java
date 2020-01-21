/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 * Clase abstracta que sirve para implementar la creacion de la TV y del color
 * 
 */
public abstract class TvAbstractFactory {
    public abstract TV createTV();
    public abstract Color createColor();
    
}
