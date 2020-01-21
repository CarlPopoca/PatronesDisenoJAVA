/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author Praxis
 */
public class Director implements IAprobador{
    private IAprobador next;
    @Override
    public void setNext(IAprobador aprobador) {
       this.next = aprobador;
    }

    @Override
    public IAprobador getNext() {
        return this.next;
    }

    @Override
    public void SolicitudPrestamo(int monto) {
        if (monto >100000)
        {
            System.out.println("Lo manejo yo, el Director");  
        }
    }
    
}
