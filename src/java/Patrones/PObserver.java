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
import Observer.*;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PObserver")
@ViewScoped
public class PObserver {

    /**
     * Creates a new instance of PObserver
     */
    public PObserver() {
    }
    public void ejecutarObserver(ActionEvent actionEvent)
    {
        Biblioteca b = new Biblioteca();
        b.attach(new Compras());
        b.attach(new Administracion());
        b.attach(new Stock());
        
        Libro libro = new Libro("Patrones en Java");
        libro.setEstado("MALO");
        b.recibeLibro(libro);
        addMessage("Ejecución exitosa Observer");
        
    }
       public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
