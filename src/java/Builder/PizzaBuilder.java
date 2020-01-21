/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/*Clase abstracta que usara para definir los metodos que se implementaran, y para inicializar y devolver la 
 clase llenada*/
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void crearNuevaPizza(){pizza = new Pizza();}
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    
}
