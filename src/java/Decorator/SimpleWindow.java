/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Praxis
 */
public class SimpleWindow implements Window {

    @Override
    public void draw() {
        //draw Window
    }

    @Override
    public String getDescripcion() {
        return "simple window";
    }
    
}
