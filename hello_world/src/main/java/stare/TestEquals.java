import java.util.Scanner;

/**
 * Created by RENT on 2017-02-13.
 */
public class TestEquals {
    String string1 = "HELLO";

    public static void main(String[] args) {
        TestEquals testEquals = new TestEquals();
        String b = "HELLO";
        System.out.println(b == testEquals.string1);
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println(i);

    }
}
