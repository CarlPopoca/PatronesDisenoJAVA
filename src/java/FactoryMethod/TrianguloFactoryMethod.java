/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * Crea el producto triangulo, proporcionando el valor de los tres lados
 * El constructor de la clase abstracta triangulo recibe el valor de los tres lados
 */
public interface TrianguloFactoryMethod {
    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC);
    
}
