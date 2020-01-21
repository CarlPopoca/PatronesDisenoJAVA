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
import Decorator.Window;
import Decorator.HorizontalScrollBarDecorator;
import Decorator.VerticalScrollBarDecorator;
import Decorator.SimpleWindow;

/**
 *
 * Concatena la cadena de SimpleWindows con la de VerticalScrollBarDecorator
 */
@ManagedBean(name="PDecorator")
@RequestScoped
public class PDecorator {
   
    public PDecorator() {
    }
    public void ejecutarDecorator(ActionEvent actionEvent)
    {
        Window decorator = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        addMessage("Ejecución Decorator exitosa " + decorator.getDescripcion());
    }
      public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
