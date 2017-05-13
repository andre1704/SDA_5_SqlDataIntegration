package zadaniaobiektowe;

/**
 * Created by RENT on 2017-02-14.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "a";
        user1.age = 1;
        User user2 = new User();
        user2.name = "b";
        user2.age = 2;
        User user3 = new User();
        user3.name = "c";
        user3.age = 3;
        System.out.println(user1.name + " " + user1.age);
        System.out.println(user2.name + " " + user2.age);
        System.out.println(user3.name + " " + user3.age);
    }
}

