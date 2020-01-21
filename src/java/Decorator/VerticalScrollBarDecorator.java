/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * Al extenderse de unaa clase abstracta que implementa una interfaz y que en su contructor 
 * recibe un objeto de la misma interfaz, puede pasarle esta clase a la clase extendida a travez del 
 * super un objecto de la interfaz y usar tambien a travez del super sus metodos
 */

public class VerticalScrollBarDecorator extends WindowsDecorator {

    public VerticalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }
    private void  drawVerticalScrollBar(){
        //draw de vertical scrollbar
    }
    @Override
    public void draw() {
        super.draw(); drawVerticalScrollBar();
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " incluye vertical scrollbars"; 
    }
    
    
}
