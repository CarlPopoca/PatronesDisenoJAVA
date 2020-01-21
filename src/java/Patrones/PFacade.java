/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Facade.Computer;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PFacade")
@RequestScoped
public class PFacade {

    public void ejecutarFacade(ActionEvent actionEvent)
    {
        Computer facade = new Computer();
        facade.start();
        addMessage("Ejecucion exitosa Facade");
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
