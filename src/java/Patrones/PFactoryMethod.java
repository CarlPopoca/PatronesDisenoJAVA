/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import FactoryMethod.TrianguloFactoryMethod;
import FactoryMethod.TrianguloFactory;
import FactoryMethod.Triangulo;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PFactoryMethod")
@RequestScoped
public class PFactoryMethod {

    /**
     * Creates a new instance of PFactoryMethod
     */
    public PFactoryMethod() {
    }
    public void ejecutarFactoryMethod(ActionEvent actionEvent)
    {
            TrianguloFactoryMethod factory = new TrianguloFactory();
            Triangulo triangulo = factory.createTriangulo(10, 10, 10);
            addMessage("Ejecucion Factory Method exitosa..." + triangulo.getDescripcion());
    }
       public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
