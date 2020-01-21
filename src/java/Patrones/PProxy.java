/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import Proxy.Image;
import Proxy.ProxyImage;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="PProxy")
@ViewScoped
public class PProxy {

    /**
     * Creates a new instance of PProxy
     */
    public void ejecutarProxy(ActionEvent actionEvent)
    { 
        final Image Img1 = new ProxyImage("Image 1");
        final Image Img2 = new ProxyImage("Image 2");
       
        Img1.displayImage();
        Img1.displayImage();
        Img2.displayImage();
        Img2.displayImage();
        Img1.displayImage();
        
        addMessage("Ejecución Proxy exitosa");
        
    }
    public PProxy() {
    }
        public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
