/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import Visitor.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Praxis
 */
@ManagedBean(name="Pvisitor")
@ViewScoped
public class PVisitor {

    /**
     * Creates a new instance of PVisitor
     */
    public PVisitor() {
    }
     public void ejecutarVisitor(ActionEvent actionEvent)
    {
        TwoElement two1 = new TwoElement(3,3);
        TwoElement two2 = new TwoElement(2,7);
        ThreeElement three1 = new ThreeElement(3,4,5);
        List<NumberElement> numberElement = new ArrayList<NumberElement>();
        numberElement.add(two1);
        numberElement.add(two2);
        numberElement.add(three1);
        
            addMessage("Visitando lista de elemntos con SumVisitor");
            NumberVisitor sumVisitor = new SumVisitor();
            sumVisitor.visit(numberElement);
            
            addMessage("Visitando lista de elemntos con TotalSumVisitor");
            TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
            totalSumVisitor.visit(numberElement);
            addMessage("Total Sum:"+totalSumVisitor.GetTotalSum());
    }
    
     public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
