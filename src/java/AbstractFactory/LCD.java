/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *Esta clase hereda los atributos publicos de TV, su getter y setter
 * 
 */
public class LCD extends TV {
   private double costoFabricacion;

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }
   
   public LCD(){
       //Se pasa el tipo de TV, en este caso es LCD por definicion
       setDescripcion("LCD");
   }
   public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion)
   {
       super(marca, pulgadas, color, precio);
       setCostoFabricacion(costoFabricacion);
   }
}
