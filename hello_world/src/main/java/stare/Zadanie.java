import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zadanie {
    int najwiekszy(ArrayList<Integer> lista) {
        int najwiekszy = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (najwiekszy < lista.get(i))
                najwiekszy = lista.get(i);
        }
        return najwiekszy;
    }

    public static void main(String[] args) {
        Zadanie nowa=new Zadanie();
        ArrayList<Integer> lista=new ArrayList<Integer>();
        lista.add(12);
        lista.add(12);
        lista.add(123);
        lista.add(40);
        lista.add(79);
        lista.add(2);
        lista.add(5);
        System.out.println(nowa.najwiekszy(lista));
    }
}
