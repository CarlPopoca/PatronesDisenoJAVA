/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.Stack;

/**
 *
 * @author Praxis
 */
public class TerminalExpression_Plus implements Expression {

    @Override
    public void interpret(Stack<Integer> s) {
        s.push(s.pop()+s.pop());
    }
    
}
