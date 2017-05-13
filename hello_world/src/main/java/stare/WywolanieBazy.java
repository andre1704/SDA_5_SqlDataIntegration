/**
 * Created by RENT on 2017-02-11.
 */
public class WywolanieBazy {
    public static void main(String[] args) {
//        ArrayList<Film> lista = new ArrayList<Film>();
        Film film1 = new Film("Nova", 6);
        Film film2 = new Film("Harry Potter", 6);
        Baza baza = new Baza();
        baza.dodaj(film1);
        baza.dodaj(film2);
        baza.wypisz();
        baza.usun(film1);
        baza.wypisz();
    }
}

