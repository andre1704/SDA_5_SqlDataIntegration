/**
 * Created by RENT on 2017-02-08.
 */
public class table {
    public static void main(String[] args) {
        int[] digits = {2, 3, 7, 15, 234, 45, 67, 8, 6, 4, 3, 100};

        for (int current :digits)
            if (current%2==0)
                System.out.println(current);


    }


}