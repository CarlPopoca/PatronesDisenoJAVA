/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterWrapper;

/**
 *
 * @author Praxis
 */
public class ElectricAcousticGuitar extends Guitar {
    AcousticGuitar acoustic;
    public ElectricAcousticGuitar() {
        acoustic = new AcousticGuitar();
    }
   
    @Override
    public void onGuitar() {
       acoustic.play();
    }

    @Override
    public void offGuitar() {
        acoustic.leaveGuitar();
    }
    
}
