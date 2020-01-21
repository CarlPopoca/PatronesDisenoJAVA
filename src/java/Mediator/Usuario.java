/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Praxis
 */
public class Usuario implements IUsuarioChat {

    public Usuario(SalonDeChat salon) {
        this.salon = salon;
    }
    private String nombre;
    private SalonDeChat salon;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void recibe(String de, String msg) {
        String s="el usuario " + de + " te dice: " + msg;
        System.out.println(this.nombre + ":" + s);
    }

    @Override
    public void envia(String a, String msg) {
       salon.envia(nombre, a, msg);
    }
    
}
