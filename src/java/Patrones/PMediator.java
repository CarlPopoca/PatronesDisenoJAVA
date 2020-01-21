/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Mediator.*;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PMediator")
@ViewScoped
public class PMediator {

    /**
     * Creates a new instance of PMediator
     */
    public PMediator() {
    }
     public void ejecutarMediator(ActionEvent actionEvent)
    {
        SalonDeChat s = new SalonDeChat();
        Usuario u = new Usuario(s);
        u.setNombre("Juan");
        s.registra(u);
        Usuario u1 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u1);
        Usuario u2 = new Usuario(s);
        u2.setNombre("Pedro");
        s.registra(u2);
        
        u.envia("Pepe", "Hola, como estas?");
        u1.envia("Juan", "Muy bien y tu?");
        u2.envia("Martin", "Martin estas?");
        
        addMessage("Ejecucion exitosa Mediator");
    }
    
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
