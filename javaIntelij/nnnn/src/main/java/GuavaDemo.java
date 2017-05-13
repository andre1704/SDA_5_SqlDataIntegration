import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andre on 08.03.2017.
 */
public class GuavaDemo {
    public static void main(String[] args) {
        String [] array=new String[]{"A","B","C"};
        String s=Joiner.on("_").join(array);
        System.out.println(s);
        BiMap<String, String> biMap= HashBiMap.create();
        biMap.put("a","b");
        String x=biMap.get("a");
        String y=biMap.inverse().get("b");
        System.out.println(x);
        System.out.println(y);

    }
}
