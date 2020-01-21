/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * Clase decoradora, implementa Window
 */
 public abstract class WindowsDecorator implements Window{
    protected Window decoratedWindow;
    public WindowsDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
   
    @Override
    public void draw() {
        decoratedWindow.draw();
    }

    @Override
    public String getDescripcion() {
       return decoratedWindow.getDescripcion();
    }
    
}
