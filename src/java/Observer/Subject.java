/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * Proporciona el agregar y eliminar observadores, no conocera a todos sus observadores
 */
public interface Subject {
    //Agregar 
    public void attach(ILibroMalEstado observador);
    //Eliminar
    public void dettach(ILibroMalEstado observador);
    //Notifica
    public void notifyObservers();
}
