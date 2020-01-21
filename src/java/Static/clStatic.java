/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author Praxis
 */
public class clStatic {
    private int intValorNormal;
    private static int intValorStatic;

    public static int getIntValorStatic() {
        return intValorStatic;
    }

    public static void setIntValorStatic(int intValorStatic) {
        clStatic.intValorStatic = intValorStatic;
    }

    public int getIntValorNormal() {
        return intValorNormal;
    }

    public void setIntValorNormal(int intValorNormal) {
        this.intValorNormal = intValorNormal;
    }
   
    //Las propiedades privadas son reconocidos como objetos
    //Las propiedades estaticas como variables

    public void ejecutarNormal()
    {
        System.out.print("");
    }

    //metodo que devuelve un entero
   public static int ejecutarStatic(int intValor)
    { 
        return intValor;
    }

}
