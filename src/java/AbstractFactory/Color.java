/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *Clase color, recibira el color y coloreara la TV
 */
public abstract class Color {
    private String descripcion;
    public abstract void colorea (TV tv);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
