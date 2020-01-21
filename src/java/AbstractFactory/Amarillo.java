/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * Define el color de la televion en amarillo
 */
public class Amarillo extends Color {

    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de amarillo el" + tv.getDescripcion());
    }
    
}
