package petlaforeach;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by RENT on 2017-02-20.
 */
public class IteratorNauka {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>();
        String current;
        Iterator<String> iterator=lista.iterator();
        while (iterator.hasNext()){
            current=iterator.next();
        }
    }
}
