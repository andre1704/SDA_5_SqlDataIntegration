package hashmap;

import java.util.*;

/**
 * Created by RENT on 2017-02-16.
 */
public class Main {
    public static void main(String[] args) {
        Map<Long, String> usertoName = new HashMap<>();
        usertoName.put(1l, "john");
        usertoName.put(2l, "emmma");
        usertoName.put(3l, "emmma");
        Set<String> has = new HashSet();
        String a = "kk";
        String b = "as";
        has.add(a);
        has.add(b);
        for (String s:has) {
            System.out.println(s);
        }
        for(Long key:usertoName.keySet()){
            System.out.println(key);
            System.out.println(usertoName.get(key));
        }
        for(String value:usertoName.values()){
            System.out.println(value);
        }
        for(Map.Entry<Long,String> entry:usertoName.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
