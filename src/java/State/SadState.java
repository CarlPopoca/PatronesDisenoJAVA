/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * Concrete State 
 */
public class SadState implements EmotionalState{

    @Override
    public String sayHello() {
       return "Bye, Sniff, Sniff";
    }

    @Override
    public String sayGoobBye() {
        return "Hello, Sniff, Sniff";
    }
    
}
