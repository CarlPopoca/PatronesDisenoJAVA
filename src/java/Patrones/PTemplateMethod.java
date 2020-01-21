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
import TemplateMethod.*;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PTemplateMethod")
@ViewScoped
public class PTemplateMethod {

    /**
     * Creates a new instance of PTemplateMethod
     */
    public PTemplateMethod() {
        
    }
      public void ejecutarTemplateMethod(ActionEvent actionEvent)
    {
        Automovil autoManual = new AutomovilManual();
        autoManual.desplazar();
        
        Automovil autoAutomatico = new AutomovilAutomatico();
        autoAutomatico.desplazar();
        addMessage("Ejecución exitosa Template Method");
    }
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
