/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;
import Builder.Cocina;
import Builder.HawaiPizzaBuilder;
import Builder.PizzaBuilder;
import Builder.Pizza;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PBuilder")
@ViewScoped
public class PBuilder {

    /**
     * Creates a new instance of pBuilder
     */
    public PBuilder() {
       
    }
   public void ejecutarBuilder(ActionEvent actionEvent)
    {
         Cocina cocina = new Cocina();
        PizzaBuilder hawai = new HawaiPizzaBuilder();
        
        cocina.setPizzaBuilder(hawai);
        cocina.ConstruirPizza();
        Pizza pizza = cocina.getPizza();
         addMessage("Ejecucion builder exitosa");
        
    }
        public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
       
}
