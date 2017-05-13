package singleton;

/**
 * Created by RENT on 2017-02-15.
 */
public class Singleton {
    private static Singleton instance;
    Singleton(){}
    public static Singleton getInstance(){
       if(instance==null)
           instance=new Singleton();
        return instance;
    }



}
