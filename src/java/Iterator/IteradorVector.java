/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Praxis
 */
public class IteradorVector {
    private int[]_vector;
    private int _posicion;
    public IteradorVector(Vector2 vector) {
        _vector = vector._datos;
        _posicion =0;
    }
    
    public boolean hasNext()
    {
        if (this._posicion<_vector.length)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public Object next()
    {
        int valor = _vector[this._posicion];
        this._posicion++;
        return valor;
    }
}
