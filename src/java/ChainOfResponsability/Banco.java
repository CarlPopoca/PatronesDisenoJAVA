/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author Praxis
 */
public class Banco implements IAprobador {
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
     EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
     this.setNext(ejecutivo);
     LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
      ejecutivo.setNext(lider);
     Gerente gerente = new Gerente();
     lider.setNext(gerente);
     Director director = new Director();
     gerente.setNext(director);
     next.SolicitudPrestamo(monto);
    }
    
}
