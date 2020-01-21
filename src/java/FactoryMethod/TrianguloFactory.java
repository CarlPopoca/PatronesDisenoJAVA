/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * Dependiendo de las medidas de los lados se creara el tipo de traingulo
 */
public class TrianguloFactory  implements TrianguloFactoryMethod {

    @Override
    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
        if ((ladoA==ladoB) && (ladoA==ladoC))
        {
            return new Equilatero (ladoA, ladoB, ladoC);
        }else if(ladoA!=ladoB && ladoA!=ladoC && ladoB!=ladoC)
        {
           return new Escaleno(ladoA, ladoB, ladoC);
        }else
        {
            return new Isoseles(ladoA, ladoB, ladoC);
        }
    }
    
}
