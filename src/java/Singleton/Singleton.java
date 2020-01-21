/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * Clase Singleton, solo podra ser instanciada una vez
 */
public class Singleton {

    public static Singleton getInstance() {
        return instance;
    }

    public static final Singleton instance = new Singleton();
    private Singleton() {
    }
   
}
