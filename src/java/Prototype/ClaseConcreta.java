/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Praxis
 */
public class ClaseConcreta extends Prototipo{

    public ClaseConcreta(String id) {
        super(id);
    }

    @Override
    public Prototipo clone() {
         ClaseConcreta clon = new ClaseConcreta(getId());
      return clon;
    }
    
}
