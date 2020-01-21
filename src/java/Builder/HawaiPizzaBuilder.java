/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 * Tipo de Producto, pizza hawaina
 * 
 */
public class HawaiPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salsichon");
    }
    
}
