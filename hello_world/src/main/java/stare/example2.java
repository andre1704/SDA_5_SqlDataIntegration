/**
 * Created by RENT on 2017-02-08.
 */
public class example2 {
    public static void main(String[] args) {
        int a = 4;
        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println("przedział 1,2,3");
                break;
            default:
                System.out.println("inne");
        }
        if ((a >= 1) && (a <= 3))
            System.out.println("nalezy do przedzialu 1,2,3");
        else if ((a > 3) && (a < 7))
            System.out.println("nalezy do przedzialu 4,5,6");
        else
            System.out.println("inne");
    }
}
