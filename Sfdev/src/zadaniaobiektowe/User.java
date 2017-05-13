package zadaniaobiektowe;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-14.
 */
public class User {
    public final static String DEFAULT_NAME = "No name";
    public String name;
    public String surname;
    public static List<String> lista;

    static {
        lista = new ArrayList<>();
        lista.add("no name1");
        lista.add("no name2");
    }

    public int age;

    public String getName() {
        return name == null ? DEFAULT_NAME : name;
    }
}

class MathOpp {
    public static int add(int a, int b) {
        return a + b;
    }
}