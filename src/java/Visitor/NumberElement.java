/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * interfaz para los elementos que se visitan
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
    
}
