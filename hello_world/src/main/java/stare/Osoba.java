/**
 * Created by RENT on 2017-02-09.
 */
public class Osoba {
    String imie;
    String nazwisko;
    void wypisz(){
        System.out.println("Witaj: "+imie+" "+nazwisko);
    }
    public static void main(String[] args) {
        Osoba ja=new Osoba();
        ja.imie="Andrzej";
        ja.nazwisko="Slowinski";
        ja.wypisz();

    }

}
