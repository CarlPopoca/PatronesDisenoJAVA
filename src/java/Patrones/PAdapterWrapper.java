/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import AdapterWrapper.ElectricAcousticGuitar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import AdapterWrapper.Guitar;
import AdapterWrapper.ElectricGuitar;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/**
 *
 * @author Praxis
 */
@ManagedBean(name="PAdapterWrapper")
@ViewScoped
public class PAdapterWrapper {

    public PAdapterWrapper() {
    }

    public void ejecutarAdapterWrapper(ActionEvent actionEvent)  
    {
        Guitar eGuitar = new ElectricGuitar();
        eGuitar.onGuitar();
        eGuitar.offGuitar();
        Guitar eAGuitar = new  ElectricAcousticGuitar();
        eAGuitar.onGuitar();
        eAGuitar.offGuitar();
        addMessage("Implementación exitosa");
    }
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
