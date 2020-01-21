/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import Modulo.ConsoleDemo;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PModulo")
@ViewScoped
public class PModulo {

    public PModulo() {
       
    }
    public void ejecutarModulo(ActionEvent actionEvent)
    {
        ConsoleDemo.prepare();
        ConsoleDemo.execute();
        ConsoleDemo.unprepare(); 
        addMessage("Ejecución exitosa de Modulo");
    }
       public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
