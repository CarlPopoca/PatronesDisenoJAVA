/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Command.Light;
import Command.Command;
import Command.FlipUpCommand;
import Command.FlipDownCommand;
import Command.Switch;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PCommand")
@ViewScoped
public class PCommand {

    public PCommand() {
    }
    public void ejecutarCommand(ActionEvent actionEvent)
    {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        
        Switch s = new  Switch(switchUp,switchDown);
        s.flipUp();
        s.flipDown();
        addMessage("Ejecución Command exitosa");
        
    }
    
        public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
