/**
 * Created by RENT on 2017-02-21.
 */
public class ForTest {

    static {
        System.out.println(max_list(new int[]{1, 2, 3, 4, 5}));
    }

    public static int max_list(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("asd");
    }

}


