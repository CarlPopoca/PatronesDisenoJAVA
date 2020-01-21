/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgGeneral;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import Protected.clsProtected;
import Static.clStatic;
import Final.clClassMetodoFinal;

/**
 *
 * @author Praxis
 */
@ManagedBean
@ViewScoped
public class ConceptosGenerales {

    /**
     **/
    public ConceptosGenerales() {
     //***********PROTECTED***************
        //Una clase protected no se puede instanciar en otros paquetes*******
        clsProtected cl;
    //*************STATIC*******************
        //Una clase protected no se puede instanciar en otros paquetes*******
        clStatic cls = new clStatic();
        //Ejecuta el metodo que no es estatico
        cls.ejecutarNormal();
        //coloca un valor en la propiedad que no es statica
        cls.setIntValorNormal(1);
        //obtiene un valor en la propiedad que no es estatica
        int i = cls.getIntValorNormal();
        //Obtiene el valor de la propiedad estatica
        int j = clStatic.getIntValorStatic();
        //coloca un valor a la propiedad estatica si no esta en le mismo paquete
        // de lo contrario no funciona
        clStatic.setIntValorStatic(i);
       int k = clStatic.ejecutarStatic(i);
       //***********FINAL*************
        clClassMetodoFinal cf = new clClassMetodoFinal();
        //Se puede ejecutar el metodo final siempre y cuando sea publico
        cf.ejecutarObjFinal();
     
        //Se obtiene de otra forma el valor de la propiedad declarada como final
        System.out.print( cf.getIntValorFinal());
      
    }
}
