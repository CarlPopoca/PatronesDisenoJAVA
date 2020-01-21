/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * Clase directora, se llama cocina porque ademas de que puedas ofrecer el producto de pizza
 * podrias ofrecer otros, generalmente se incializa el producto, se construye y se devuleve
 * se definiria como el cosntructor del producto solicitado
 */
public class Cocina {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }
    public void ConstruirPizza()
    {
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }
    
}
