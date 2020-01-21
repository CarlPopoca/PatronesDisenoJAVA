/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Praxis
 */
public class Biblioteca implements Subject {
    private static ArrayList<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();
    
    public void recibeLibro(Libro libro)
    {
        if (libro.getEstado().equals("MALO"))
        {
            notifyObservers();
        }
    }
    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
         for(int i=0; i<observadores.size(); i++)
         {  
             observadores.get(i).update();
         }
    }
    
}
