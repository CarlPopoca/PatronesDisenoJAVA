/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * Concrete State
 */
public class HappyState implements EmotionalState {

    @Override
    public String sayHello() {
        return "Hello, friend!";
    }

    @Override
    public String sayGoobBye() {
        return "Bye, friend!";
    }
    
}
