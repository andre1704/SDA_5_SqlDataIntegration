/**
 * Created by RENT on 2017-02-11.
 */
public class Film {
    String nazwaFilmu;
    int ocenaFilmu;

    Film(String nazwaFilmu, int ocenaFilmu) {
        this.nazwaFilmu = nazwaFilmu;
        this.ocenaFilmu = ocenaFilmu;
    }

    void wypiszDaneFilmu() {
        System.out.println("Nazwa filmu " + nazwaFilmu + " ocena filmu " + ocenaFilmu);
    }

}
