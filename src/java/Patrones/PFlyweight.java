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
import Flyweight.FlyweightFactory;
import Flyweight.Flyweight;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PFlyweight")
@ViewScoped
public class PFlyweight {

  
    public void ejecutarPFlyweight(ActionEvent actionEvent)
    {
            FlyweightFactory fly = FlyweightFactory.getInstance();
            for (int i=0; i<5;i++)
            {
                Flyweight flyAdder = fly.getFlyweight("add");
                flyAdder.doMath(i, i);
                
                Flyweight flyMul = fly.getFlyweight("multiply");
                flyMul.doMath(i, i);
            }
            addMessage("Ejecucion Flyweight exitosa...");
    }
      
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
