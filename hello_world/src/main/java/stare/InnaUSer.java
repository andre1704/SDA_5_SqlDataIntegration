/**
 * Created by RENT on 2017-02-14.
 */
public class InnaUSer {
    public static void main(String[] args) {
        new InnaUSer().start();

    }

    public void start() {
        User u = new User();
        u.name = "test";
        u.surname = "test";
        testUser(u);
    }

    public void testUser(Object o) {
        System.out.println(o.hashCode());
        User user;
        if (o instanceof User){
            user = (User) o;
            System.out.println(user.name);
        }

    }
}
