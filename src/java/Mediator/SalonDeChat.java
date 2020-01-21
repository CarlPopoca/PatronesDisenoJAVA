/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.util.HashMap;

/**
 *
 * @author Praxis
 */
public class SalonDeChat implements ISalonDeChat{
    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario> ();

    @Override
    public void registra(Usuario participante) {
       participantes.put(participante.getNombre(), participante);
    }

    @Override
    public void envia(String de, String a, String msg) {
       if (participantes.containsKey(de)&&participantes.containsKey(a))
       {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
       }else
       {
           System.out.println("Usuario Inexistente");
       }
    }
    
}
