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
import Bridge.Abstraccion;
import Bridge.AbstraccionRefinada;
import Bridge.ImplementacionA;
import Bridge.ImplementacionB;


/**
 *
 * @author Praxis
 */
@ManagedBean(name="PBridge")
@ViewScoped
public class PBridge {

    /**
     * Creates a new instance of PBridge
     */
    public PBridge() {
    }
    public void ejecutarBridge(ActionEvent actionEvent)  
    {
        Abstraccion [] abstracciones = new Abstraccion[2];
         abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
         abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());
        for (Abstraccion astraccion:abstracciones)
        {
                astraccion.operacion();
                addMessage("Implementacion exitosa");
        }
    }
    
      public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
