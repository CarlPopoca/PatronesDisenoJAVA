/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * Tipo de Producto, pizza picante
 */
public class PicantePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
            pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
         pizza.setMasa("dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("chorizo+alcachofas");
    }
   
}
