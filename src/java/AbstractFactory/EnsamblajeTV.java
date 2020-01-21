/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * Calse que recibe la clase que construye la TV y define el color 
 */
public class EnsamblajeTV {

    public EnsamblajeTV(TvAbstractFactory factory) {
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
    
}
