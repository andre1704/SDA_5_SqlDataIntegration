/**
 * Created by RENT on 2017-02-09.
 */
public abstract class Figura {
    String kolor;

    Figura(String kolor) {
        this.kolor = kolor;
    }

    void opisz() {
        System.out.println("Kolor: " + kolor);
    }

    public abstract int powierzchnia();

    public abstract void figura();

}
