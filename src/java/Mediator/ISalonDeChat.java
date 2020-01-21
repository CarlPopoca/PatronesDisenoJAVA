/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Praxis
 */
public interface ISalonDeChat {
    public abstract void registra(Usuario participante);
    public abstract void envia(String de, String a, String msg);
}
