/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author Praxis
 */
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static FlyweightFactory  flyweightFactory ;
    private Map<String, Flyweight> flyweightPool;

    public static FlyweightFactory getInstance()
    {
            if (flyweightFactory==null)
            {
                    flyweightFactory = new FlyweightFactory();
            }
            return flyweightFactory;
    }
    private FlyweightFactory() {
        this.flyweightPool = new HashMap<String, Flyweight>();
        
    }
    public Flyweight getFlyweight(String key)
    {
         
        if (flyweightPool.containsKey(key))
        {
            return flyweightPool.get(key);
        }else
        {
           Flyweight flyweight;
            if ("add".equals(key))
            {
                flyweight = new FlyweightAdder();
            }else
            {
                flyweight = new FlyweightMultiplier();
            }
                
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
       
    }
}
