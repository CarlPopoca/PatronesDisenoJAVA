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
import Interpreter.Parser;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PInterpreter")
@ViewScoped
public class PInterpreter {

    /**
     * Creates a new instance of PInterpreter
     */
    public PInterpreter() {
        
    }
    public void ejecutarInterpreter(ActionEvent actionEvent)
    {
        addMessage("'42 2 1 - +'equals " + new Parser("42 2 1 - +").evaluate());
        
    }
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
