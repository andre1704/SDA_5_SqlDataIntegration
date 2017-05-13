/**
 * Created by RENT on 2017-02-08.
 */
public class sort {
    public static void main(String[] args) {
        int x = 0;
        int stop = 0;
        int i = 0;
        int[] table = {5, 2, 7, 3};
        do {
            stop = 0;
            i = 0;
            for (; i < table.length - 1; i++) {
                if (table[i] > table[i + 1]) {
                    x = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = x;
                    stop++;
                    System.out.println("stop "+stop);
                }
            }
        } while (stop != 0);

        for (int k = 0; k < table.length; k++) {
            System.out.println(table[k]);
        }

    }
}
