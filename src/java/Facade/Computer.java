/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Praxis
 */
public class Computer {
    int BOOT_ADDRESS = 0;
    int BOOT_SECTOR = 0;
    byte BOOT_SIZE = 0; 
    
    private CPU processor;
    private Memory ram;
    private HardDrive hd;
    public Computer()
    {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }
    public void start()
    {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, BOOT_SIZE));
        processor.execute();
    }
    
}
