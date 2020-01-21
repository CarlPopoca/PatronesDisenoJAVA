/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * Producto triangulo
 */
public abstract class Triangulo {

    public Triangulo(int ladoA, int ladoB, int ladoC) {
       setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }
      public Triangulo()
      {
      }
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    
    public abstract String getDescripcion();
}
