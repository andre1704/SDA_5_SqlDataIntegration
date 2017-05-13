/**
 * Created by RENT on 2017-02-09.
 */
public class Trojkat extends Figura {
    int dlugoscBoku;
    int wysokosc;

    Trojkat(int dlugoscBoku, int wysokosc, String kolor) {
        super(kolor);
        this.dlugoscBoku = dlugoscBoku;
        this.wysokosc = wysokosc;
    }

    public int powierzchnia() {
        return  (dlugoscBoku * wysokosc) / 2;
    }
    public void figura(){
        System.out.println("trojkat");
    }
}
