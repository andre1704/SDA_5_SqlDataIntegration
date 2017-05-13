package object.stat;

/**
 * Created by RENT on 2017-02-14.
 */
public class User {
    public final static String DEFAULT_NAME = "No name";
    public String name;
    public String surname;
    public int age;

    public  String getName() {
        return name == null ? DEFAULT_NAME : name;
    }
}
class MathOpp{
    public static int add(int a, int b){
        return  a+b;
    }
}
