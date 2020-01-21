/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * Crea la Television tipo Plasma y define el color que tendra
 */
public class FactoryPlasmaAmarillo extends TvAbstractFactory{

    @Override
    public TV createTV() {
        return new Plasma();
    }

    @Override
    public Color createColor() {
        return new Amarillo();
    }
    
}
