/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

import java.util.ArrayList;

/**
 *
 * @author Praxis
 */
import java.util.Stack;
import java.util.*;
public class Parser {
    private ArrayList<Expression> parseTree = new ArrayList<Expression> ();
    
    public Parser(String s)
    {
        for (String token: s.split(" "))
        {
            if (token.equals("+"))
                parseTree.add(new TerminalExpression_Plus());
            else if (token.equals("-"))
                parseTree.add(new TerminalExpression_Minus());
            else
                parseTree.add(new TerminalExpression_Number(Integer.valueOf(token)));
        }
    }
    
    public int evaluate()
    {
        Stack<Integer> context = new Stack<Integer> ();
        for (Expression e:parseTree)
        {
            e.interpret(context);
        }
        return context.pop();
    }
    
}
