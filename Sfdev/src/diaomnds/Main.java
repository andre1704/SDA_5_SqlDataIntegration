package diaomnds;

/**
 * Created by RENT on 2017-02-18.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> lista = new MyArrayList<>();
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "e";
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);

        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains(s4));
        System.out.println(lista.lastInxedOf("c"));
        lista.get(213);
        try{
            System.out.println(lista.get(111));
        }catch (ExceptionOutOfRange e){
            System.out.println(e.getMessage());

        }


    }
}
