/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author Praxis
 */
public abstract class Automovil {
    public void desplazar()
    {
        acelerar();
        cambiarMarcha();
        frenar();
        
    }
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void frenar()
    {
        System.out.println("Frenando");
    }
    public abstract void cambiarMarcha();
} 

