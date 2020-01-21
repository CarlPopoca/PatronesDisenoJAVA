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
import Singleton.Singleton;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PSingleton")
@ViewScoped
public class PSingleton {

    /**
     * Creates a new instance of PSingleton
     */
    public PSingleton() {
    }
    
    public void ejecutarSingleton(ActionEvent actionEvent)
    {
        Singleton.getInstance();
        addMessage("Ejecución Singleton exitosa");
        
    }
        public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
