/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Praxis
 */
public class Plasma extends TV {
    private double anguloVision;
    private double tiempoRespuesta;
    public Plasma(){
        setDescripcion("Plasma...proximamente sera un LCD");
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
    public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision, double tiempoRespuesta)
    {
        super(marca, pulgadas, color, precio);
        setAnguloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
        
        
    }
}
