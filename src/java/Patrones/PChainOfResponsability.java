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
import ChainOfResponsability.Banco;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PChainOfResponsability")
@ViewScoped
public class PChainOfResponsability {

    public void ejecutarChainOfResponsability(ActionEvent actionEvent)
    {
        Banco banco = new Banco();
        banco.SolicitudPrestamo(110000);
        addMessage("Ejecución Chain Of Responsability exitosa");
        
    }
    public PChainOfResponsability() {
    }
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
