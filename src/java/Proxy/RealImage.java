/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Praxis
 */
public class RealImage implements Image{
    private String filename = null;
    public RealImage(final String filename ) {
        this.filename = filename;
    }
    public void loadInageFromDisk()
    {
        System.out.print("Loading"+filename );
    }

    @Override
    public void displayImage() {
     System.out.print("Loading"+filename );
    }
    
}
