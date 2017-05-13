package hashcode;

import zadaniaobiektowe.User;

/**
 * Created by RENT on 2017-02-15.
 */
public class Person {
    private String name;
    private int age;
    private String pesel;

    public Person(String pesel, int age, String name) {
        this.pesel = pesel;
        this.age = age;
        this.name = name;
    }


    public boolean equals(Object o) {
        if (o == this) return true;
        if (o instanceof Person) {
            Person p = (Person) o;
            boolean nameEguals = name.equals(p.name);
            boolean peselEquals = pesel == p.pesel;
            boolean ageEquals = age == p.age;
            return nameEguals && peselEquals && ageEquals;
        } else return false;
    }

    public int hashCode() {
        int hashCode = name.hashCode();
        hashCode = hashCode + 32 * pesel.hashCode();
        hashCode = hashCode + age;
        return hashCode;
    }
}
