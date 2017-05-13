import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Baza {
    ArrayList<Film> lista;

    Baza() {
        lista = new ArrayList<Film>();
    }

    void wypisz() {
        for (Film film : lista)
            film.wypiszDaneFilmu();
    }

    void dodaj(Film film) {
        lista.add(film);
    }

    void usun(Film film) {
        lista.remove(film);
    }

    Baza(ArrayList<Film> lista) {
        this.lista = lista;
    }


}
