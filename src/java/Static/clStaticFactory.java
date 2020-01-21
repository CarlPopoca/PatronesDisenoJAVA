/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

import oracle.net.aso.i;

/**
 *
 * @author Praxis
 */

public class clStaticFactory {
    //una clase no puede tener el modificador static, pero sus metodos y propiedades si
    //no es necesario instanciar la clase cuando la propiedad es estatica
 int i =  clStatic.getIntValorStatic();
 int j = clStatic.ejecutarStatic(i);
   //Si  esta en el mismo paquete no funciona el seteo de un valor
   //clStatic.setIntValor(i);
    clStatic cl = new clStatic();
    //obtiene el valor Normal de la propiedad que no es estatica, ose de uan propiedad 
    // normal, no declara como estatica
    int k = cl.getIntValorNormal();
    
}
