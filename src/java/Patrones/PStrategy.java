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
import Strategy.*;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PStrategy")
@ViewScoped
public class PStrategy {

    /**
     * Creates a new instance of PStrategy
     */
    public PStrategy() {
    }
    public void ejecutarStrategy(ActionEvent actionEvent)
    {
        Context context = new Context(new Add());
        int ResultA = context.executeStrategy(3, 4);
         context = new Context(new Subtract());
        int ResultB = context.executeStrategy(3, 4);
        context = new Context(new Multiply());
        int ResultC = context.executeStrategy(3, 4);
        
        addMessage("Rsultado Add: " + ResultA);
        addMessage("Rsultado Subtract: " + ResultB);
        addMessage("Rsultado Multiply: " + ResultC);   
    }
    
    
      public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
