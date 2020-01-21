/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * Hereda de la clase triangulo los tres lados
 */
public class Escaleno extends Triangulo {

    public Escaleno(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Soy un triangulo escaleno";
    }
    
}
