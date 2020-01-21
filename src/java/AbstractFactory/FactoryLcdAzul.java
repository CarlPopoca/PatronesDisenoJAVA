/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * Crea la Television tipo LCD y define el color que tendra
 */
public class FactoryLcdAzul extends  TvAbstractFactory{

    @Override
    public TV createTV() {
        return new LCD();
    }

    @Override
    public Color createColor() {
        return new Azul();
    }
    
}
