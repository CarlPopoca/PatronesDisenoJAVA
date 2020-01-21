/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * Clase abstracta que permitira clonarse
 */
public abstract class Prototipo implements Cloneable {

    public Prototipo(String id) {
        this.id = id;
    }
    private String id;

    public String getId() {
        return id;
    }
    
    abstract public Prototipo clone();
}
