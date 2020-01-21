/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Praxis
 */
public class FlipUpCommand implements Command{

    public FlipUpCommand(Light theLight) {
        this.theLight = theLight;
    }
    private Light theLight;
    
    @Override
    public void execute() {
        this.theLight.turnOn();
    }
    
}
