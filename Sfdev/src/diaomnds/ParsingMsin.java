package diaomnds;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-02-18.
 */
public class ParsingMsin {
    public static void main(String[] args) {
        while (true) {
            try {
                method();
                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        }


    }


    public static void method() {
        Scanner input = new Scanner(System.in);
        int pom = input.nextInt();
        System.out.println(pom);
    }
}
class AgeException extends RuntimeException{

}
