/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author Praxis
 */
import java.util.*;
public class TerminalExpression_Number implements Expression {
   private int number;
    public TerminalExpression_Number(int number) {
        this.number = number;
    }
 
   @Override
   public void  interpret(Stack<Integer>s)
     {
         s.push(number);
     }
    
}
