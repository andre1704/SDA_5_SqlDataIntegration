package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public class HddReader implements Reader, Printable{
    @Override
    public String read() {
        return "reading hddd page";
    }

    @Override
    public void proint() {
        System.out.println("hdd reading");
    }

    @Override
    public void printShort() {
        System.out.println("hdd");
    }
}
