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
public class TerminalExpression_Minus implements Expression {

    @Override
    public void interpret(Stack<Integer> s) {
        int tmp = s.pop();
        s.push(s.pop()-tmp);
    }
    
}
