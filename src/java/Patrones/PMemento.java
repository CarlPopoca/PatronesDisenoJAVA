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
import Memento.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PMemento")
@ViewScoped
public class PMemento {

    /**
     * Creates a new instance of PMemento
     */
    public PMemento() 
    {
  
    }
    public void ejecutarMemento(ActionEvent actionEvent)
    {
        List<Originator.Memento> savedSates = new ArrayList<Originator.Memento>();
        Originator originator = new Originator();
        originator.setState("state 1");
        originator.setState("state 2");
        savedSates.add(originator.saveToMemento());
        originator.setState("state 3");
        //Nosotros podemos tener multiples mementos y elegir cual de ellos restaurar
        savedSates.add(originator.saveToMemento());
        originator.setState("state 4");
        originator.restoreFromMemento(savedSates.get(1));
        addMessage("Ejecucion exitosa de Memento");
    }
      public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }  
}
