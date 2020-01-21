/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * Clase Normal que implementa una propiedad tipo final y un metodo final
 */
public class clClassMetodoFinal {
    //cuando una propiedad se declara como final se convierte en constante
    final int intValorFinal =0;

    public int getIntValorFinal() {
        return intValorFinal;
    }
    //Los metodos final se puede ejecutar
    public final void ejecutarObjFinal()
    {
       System.out.print("Se ejecuto el metodo estatico final");
    }
    
}
