/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import Prototype.ClaseConcreta;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Prototype.Prototipo;

@ManagedBean(name="PPrototype")
@ViewScoped
public class PPrototype {

    public void ejecutarPrototype(ActionEvent actionEvent)
    {
        ClaseConcreta p1 = new ClaseConcreta("Clone 1");
        
        //Prototipo p1 = new ClaseConcreta("Clone 1");
        addMessage("objeto:"+p1.getId());
        ClaseConcreta c1 = (ClaseConcreta)p1.clone();
         addMessage("clonado:"+c1.getId());
    }
    public PPrototype() {
    }
       public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
