/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 * @author Praxis
 */
//esta clase al ser declarada como final no se puede heredaar
public final class MainModule {
    public InputStream input = null;
    public PrintStream output = null;
    public PrintStream error= null;
    private static MainModule singleton = null;

    public static MainModule getSingleton() {
        if (MainModule.singleton == null)
        {
            MainModule.singleton = new MainModule();
        }
        return singleton;
    }

    public static void setSingleton(MainModule singleton) {
        MainModule.singleton = singleton;
    }
 
    public MainModule() {
        
    }

    public void prepare()
    {
        this.input = new InputStream() {

            @Override
            public int read() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //this.output = new PrintStream();
        //this.error = new PrintStream();
        
    }
    public void unprepare()
    {
        this.input = null;
        this.output = null;
        this.error = null;
        System.out.print(this);
        
    }
    public void printNewLine()
    {
        System.out.println();
        
    }
    public void printString(String value)
    {
        System.out.print(value);
    }
    public void scanNewLine()
    {
        //Cualquier linea
    }
}
