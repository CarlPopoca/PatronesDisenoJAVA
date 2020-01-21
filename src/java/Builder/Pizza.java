/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/*Producto
 * Contiene el producto, cada clase seria un producto, cada propiedad los elementos 
 * que componen al producto
 */
public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
   
    public void setMasa(String masa){this.masa = masa;}
    public void setSalsa(String salsa){this.salsa = salsa;}
    public void setRelleno(String relleno){this.relleno = relleno;}
}
