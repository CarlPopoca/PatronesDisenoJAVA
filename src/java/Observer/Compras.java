/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Praxis
 */
public class Compras implements ILibroMalEstado {

    @Override
    public void update() {
       System.out.println("Solicito nueva Cotización");
    }
    
}
