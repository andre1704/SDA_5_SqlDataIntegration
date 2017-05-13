package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public class InternetReader implements Reader {
    @Override
    public String read() {
        return "reading internet page";
    }
}
