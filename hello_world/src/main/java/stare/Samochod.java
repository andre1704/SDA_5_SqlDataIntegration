/**
 * Created by RENT on 2017-02-13.
 */

public class Samochod {
    String kolor;
    int przebieg;
    String marka;
    int rokProdukcji;

    Samochod(String kolor, int przebieg, String marka, int rokProdukcji) {
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    public void wypadek(Samochod s2) {
        System.out.println("koloer1 " + kolor + " kolor2 " + s2.kolor);
        System.out.println("s1 " + rokProdukcji + " s2 " + s2.rokProdukcji);
        System.out.println("s1 " + przebieg + " s2 " + s2.przebieg);
        System.out.println("s1 " + marka + " s2 " + s2.marka);
    }

    public String toString() {
        return kolor + " " + przebieg + " " + marka + " " + rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Samochod)) return false;

        Samochod samochod = (Samochod) o;

        if (rokProdukcji != samochod.rokProdukcji) return false;
        if (kolor != null ? !kolor.equals(samochod.kolor) : samochod.kolor != null) return false;
        return marka != null ? marka.equals(samochod.marka) : samochod.marka == null;

    }

    @Override
    public int hashCode() {
        int result = kolor != null ? kolor.hashCode() : 0;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        result = 31 * result + rokProdukcji;
        return result;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (obj.getClass() != this.getClass()) {
//            return false;
//        }
//        Samochod s1 = (Samochod) obj;
//
//        if (kolor.equals(s1.kolor) && marka.equals(s1.marka) && przebieg == s1.przebieg && rokProdukcji == s1.rokProdukcji)
//            return true;
//        else
//            return false;
//    }


    public static void main(String[] args) {
        Samochod s1 = new Samochod("bialy", 123321, "bmw", 2010);
        Samochod s2 = new Samochod("bialy", 123321, "bmw", 2010);
        Samochod a = s1;
        Samochod s3 = new Samochod("czaa", 12332, "audi", 2009);
        s1.wypadek(s2);
        int ab = 33;
        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s2.hashCode());
        System.out.println(s1 instanceof Samochod);



    }
}
