/**
 * Created by RENT on 2017-02-08.
 */
public class functions {
    static boolean isEven(int digit) {
        return digit % 2 == 0;
    }

    public static void main(String[] args) {
        int[] digits = {23, 324, 5576};
        for (int current : digits){
            if(isEven(current))
                System.out.println(current);
        }

    }
}
