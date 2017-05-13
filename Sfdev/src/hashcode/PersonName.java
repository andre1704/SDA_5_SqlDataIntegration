package hashcode;

import java.nio.channels.Pipe;
import java.util.HashSet;

/**
 * Created by RENT on 2017-02-15.
 */
public class PersonName {
    public static void main(String[] args) {
        Person p=new Person("930412321434",23,"andre");
        Person p2=new Person("93041232134",23,"andre");
        String s1="TEST";
        String s2="TEST";
        HashSet<Person> persons=new HashSet<>();
        persons.add(p);
        persons.add(p2);
        System.out.println(persons.size());
        System.out.println(p.equals(p2));
    }
}
