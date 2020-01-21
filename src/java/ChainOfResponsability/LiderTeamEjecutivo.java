/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author Praxis
 */
public class LiderTeamEjecutivo implements IAprobador {
    private IAprobador next;
    
    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }

    @Override
    public IAprobador getNext() {
       return this.next;
    }

    @Override
    public void SolicitudPrestamo(int monto) {
        if (monto>10000 && monto <= 50000)
        {
           System.out.println("Lo manejo yo, el Lider");  
        }else
        {
            next.SolicitudPrestamo(monto);
        }
      
    }
    
}
