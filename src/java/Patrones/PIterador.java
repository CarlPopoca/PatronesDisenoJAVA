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
import Iterator.Vector2;
import Iterator.IteradorVector;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PIterador")
@ViewScoped
public class PIterador {

    public PIterador() {
    }
    public void ejecutarIterador(ActionEvent actionEvent)
    {
            Vector2 vector = new Vector2(5);
            IteradorVector iterador = vector.iterador();
            while(iterador.hasNext())
            {
                addMessage("valor:" + iterador.next());
            }
        
    }
      
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
