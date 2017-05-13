package zadaniebaza;

/**
 * Created by RENT on 2017-02-16.
 */
public class Produkt {
    private Long id;
    private String catalogNumber;
    private String name;
    private Long order;

    public Produkt(Long id, String catalogNumber, String name, Long order) {
        this.id = id;
        this.catalogNumber = catalogNumber;
        this.name = name;
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produkt)) return false;

        Produkt produkt = (Produkt) o;

        if (id != null ? !id.equals(produkt.id) : produkt.id != null) return false;
        return catalogNumber.equals(produkt.catalogNumber);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + catalogNumber.hashCode();
        return result;
    }
}
