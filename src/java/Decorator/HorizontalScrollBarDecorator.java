/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Praxis
 */
public class HorizontalScrollBarDecorator extends WindowsDecorator {

    public HorizontalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }
    private void drawHorizontalScrollBar()
    {
        //draw the horizontal scrollbar
    }

    @Override
    public void draw() {
        super.draw(); drawHorizontalScrollBar();
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion(); 
    }
    
}
