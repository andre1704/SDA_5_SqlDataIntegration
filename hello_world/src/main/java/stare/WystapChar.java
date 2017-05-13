import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by RENT on 2017-02-11.
 */
public class WystapChar {
    int wystap;
    char znak;

    public static void main(String[] args) {
        char[] tablica = {'c', 'c', 'z', 'c', 'z', 'a'};
        WystapChar pom = new WystapChar();
        ArrayList<WystapChar> lista = new ArrayList<WystapChar>();
        boolean pom2 = true;
        for (int i = 0; i < tablica.length; i++) {
            pom2 = true;
            for (int k = 0; k < lista.size(); k++) {
                if (lista.get(k).znak == tablica[i]){
                    pom2 = false;
                    pom=lista.get(k);
                    pom.wystap++;
                    lista.set(k,pom);
                }

            }
            if (pom2) {
                WystapChar pom1 = new WystapChar();
                pom1.znak = tablica[i];
                pom1.wystap = 1;
                lista.add(pom1);
            }
        }
        for(WystapChar znak:lista){
            System.out.println("znak "+znak.wystap+" wystap: "+znak.znak);
        }
    }
}

