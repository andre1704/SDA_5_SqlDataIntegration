import java.util.HashSet;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zbior {
    public static void main(String[] args) {
        HashSet<Integer> zbior=new HashSet<Integer>();
        int b=3;
        zbior.add(b);
        b=4;
        zbior.add(b);
        System.out.println(zbior.size());
    }
}
