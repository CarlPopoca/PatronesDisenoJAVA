/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * Define el color de la televion en azul
 */
public class Azul extends Color {

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de azul el" + tv.getDescripcion());
    }
    
}
