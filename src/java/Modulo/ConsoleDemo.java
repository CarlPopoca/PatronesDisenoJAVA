/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author Praxis
 */

public class ConsoleDemo {
    public static MainModule console = null;
    public static void prepare()
    {
        console = MainModule.getSingleton();
        console.prepare();
    }
    public static void unprepare()
    {
        console.unprepare();
        
    }
    public static void execute()
    {
        console.printString("Hello World");
        console.printNewLine();
        console.printNewLine();
    }
  
}
