/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import AbstractFactory.EnsamblajeTV;
import AbstractFactory.FactoryLcdAzul;
import AbstractFactory.FactoryPlasmaAmarillo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import AbstractFactory.TvAbstractFactory;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PAbstractFactory")
@ViewScoped
public class PAbstractFactory {

    /**
     * Creates a new instance of PAbstractFactory
     */
    public PAbstractFactory() {
        
    }
    public void ejecutarAbstractFactory(ActionEvent actionEvent)  
    {
            TvAbstractFactory f1 = new FactoryLcdAzul();
            EnsamblajeTV e1 = new EnsamblajeTV(f1);
            
            TvAbstractFactory f2 = new FactoryPlasmaAmarillo();
            EnsamblajeTV e2 = new EnsamblajeTV(f2);
            addMessage("Ejecución Abstract Factory exitosa");
            
    }
       public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
