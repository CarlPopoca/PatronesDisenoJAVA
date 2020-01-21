/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * Una clase declarada como Final no se puede extender pero si se puede instanciar
 * y una clase normal que tiene propiedad y metodo final se pueden usar
 */
public class clFinalFactory extends clClassMetodoFinal{

    public clFinalFactory() {
        clFinal cl = new clFinal();
        cl.ejecutar();
        //metodo final en clase normal (clClassMetodoFinal)
        ejecutarObjFinal();
        //Se obtiene el valor de la propiedad declarada como final
        System.out.print(intValorFinal);
        //Se obtiene de otra forma el valor de la propiedad declarada como final
        System.out.print(getIntValorFinal());
    }
 
}
