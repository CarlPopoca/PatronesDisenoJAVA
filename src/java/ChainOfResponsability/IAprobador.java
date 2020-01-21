/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author Praxis
 */
public interface IAprobador {
    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    public void SolicitudPrestamo(int monto);
}
