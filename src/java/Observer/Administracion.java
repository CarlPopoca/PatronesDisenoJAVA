/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Praxis
 */
public class Administracion implements ILibroMalEstado {

    @Override
    public void update() {
        System.out.println("Administración: Envio una queja formal");
    }
    
}
