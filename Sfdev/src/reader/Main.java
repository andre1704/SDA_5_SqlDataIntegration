package reader;

/**
 * Created by RENT on 2017-02-15.
 */
public class Main {
    public static void main(String[] args) {
        new Main().start();

    }

    public void start() {
        String address = "wwww.google.com";
        Reader reader = address.startsWith("wwww") ? new HddReader(address) : new InternetReader(address);
        showWebPage(reader);
    }

    public void showWebPage(Reader reader) {
        System.out.println(reader.getPage());
    }
}
