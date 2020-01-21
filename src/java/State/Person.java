/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * Context
 */
public class Person implements EmotionalState {
    EmotionalState emotionalState;

    public EmotionalState getEmotionalState() {
        return emotionalState;
    }

    public void setEmotionalState(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }
    public Person(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }
 

    @Override
    public String sayHello() {
        return emotionalState.sayHello();
    }

    @Override
    public String sayGoobBye() {
        return emotionalState.sayGoobBye();
    }
    
}
