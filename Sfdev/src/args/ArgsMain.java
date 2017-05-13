package args;

/**
 * Created by RENT on 2017-02-18.
 */
public class ArgsMain {
    public static final int PATH=0;
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
