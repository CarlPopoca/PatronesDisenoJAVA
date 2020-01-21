/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Praxis
 */
public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }
  
    public void flipUp()
    {
        flipUpCommand.execute();
    }
    public void flipDown()
    {
        flipDownCommand.execute();
    }
    
}
