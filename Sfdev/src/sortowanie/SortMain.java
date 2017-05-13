package sortowanie;

import java.util.*;

/**
 * Created by RENT on 2017-02-20.
 */
public class SortMain {

    public static void main(String[] args) {
        List<User> names=new ArrayList<>();
        names.add(new User("Ann","black",125));
        names.add(new User("Brook","black",193));
        names.add(new User("Dave","black",166));
        names.add(new User("Jake","blonde",183));
        Collections.sort(names, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getHeight().compareTo(o2.getHeight());
            }
        });

        for(User name :names){
            System.out.println(name);
        }
    }


}
