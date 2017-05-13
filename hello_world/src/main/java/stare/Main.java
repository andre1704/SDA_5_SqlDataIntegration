/**
 * Created by RENT on 2017-02-07.
 */
public class Main {
    public static void main(String[] args) {

        int tree = 8;


        for (int i = 1; i <= tree; i++) {
            for (int k = tree - i; k >= 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }


    }
}