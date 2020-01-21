/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *Clase TV, contiene sus caracteristica, en un constructor se pasan los valores
 * 
 */
public abstract class TV {
    private String marca;
    private int pulgadas;
    private String color;
    private String descripcion;
    private double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public TV()
    {
    }
    public TV(String marca, int pulgadas, String color, double precio)
    {
        setMarca(marca);
        setPulgadas(pulgadas);
        setColor(color);
        setPrecio(precio);
    }
    
}
