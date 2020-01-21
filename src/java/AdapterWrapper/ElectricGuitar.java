/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterWrapper;

/**
 *
 * @author Praxis
 */
public class ElectricGuitar extends Guitar {

    @Override
    public void onGuitar() {
        System.out.println("Playing Guitar");
    }

    @Override
    public void offGuitar() {
        System.out.println("I'm tired to play the guitar");
    }
    
}
