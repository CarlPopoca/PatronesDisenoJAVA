/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Praxis
 */
import java.util.List;
import java.util.ArrayList;
public class CompositeGraphic  implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<Graphic>();
    @Override
    public void print() {
        for (Graphic graphic:childGraphics)
        {
            graphic.print();
        }
    }
    public void add(Graphic graphic)
    {
        childGraphics.add(graphic);
    }
    public void remove(Graphic graphic)
    {
        childGraphics.remove(graphic);
    }
    
}
