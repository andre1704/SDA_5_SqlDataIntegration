package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Reader internetreader=new InternetReader();
        HddReader hddReader=new HddReader();
        printPage(hddReader);
        printPage(internetreader);
        introduce(hddReader);
    }
    public static void printPage(Reader r){
        System.out.println(r.read());
    }
    public static void introduce(Printable p){
        p.printShort();
        p.proint();
    }
}
