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
import State.*;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PState")
@ViewScoped
public class PState {

   
    public PState() {
    }
     public void ejecutarState(ActionEvent actionEvent)
    {
        Person person = new Person(new HappyState());
        addMessage("Hello in happy state: " + person.sayHello());
        addMessage("Hello in happy state: " + person.sayGoobBye());
        person.setEmotionalState(new SadState());
        addMessage("Hello in sad state: " + person.sayHello());
        addMessage("GoodBye in sad state: " + person.sayGoobBye());
    }
    
      public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
