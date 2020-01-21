/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * Concrete Strategy
 */
public class Subtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a-b;
    }
    
}
