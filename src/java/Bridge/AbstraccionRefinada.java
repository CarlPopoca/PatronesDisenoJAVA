/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Praxis
 */
public class AbstraccionRefinada implements Abstraccion {
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador) {
        this.implementador = implementador;
    }
 
    @Override
    public void operacion() {
       implementador.operacion();
    }
    
}
