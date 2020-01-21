/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Praxis
 */
public class FlipDownCommand implements Command {
    private Light theLight;
    public FlipDownCommand(Light theLight) {
        this.theLight = theLight;
    }
     @Override
    public void execute() {
       this.theLight.turnOff();
    }
    
}
