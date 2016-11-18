package dsa;

import java.net.URL;
import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by Jonatan on 18/11/2016.
 */

public class Singleton {
    private static Singleton instance;
    private HashMap<String, Interfaz> cache;
    private Singleton(){
        cache = new HashMap<String, Interfaz>();
    }
    public static Singleton getInstance (){
        if (instance == null) instance = new Singleton();
        return instance;
    }
    public Singleton(String cmd) throws Exception{
        Interfaz c = cache.get(cmd);
        if (c==null){
            Class user1 = Class.forName(cmd);
            c = (Interfaz) user1.newInstance();
            cache.put(cmd,c);
        }
        return c;
    }

    private static org.apache.log4j.Logger registro;
        try{
            URL url = Loader.getResource ("log4j.properties");
            PropertyConfiguration.configure(url);
        registro = Logger.getLogger(CrearTrazas.class);
    }

}
