package reader;

/**
 * Created by RENT on 2017-02-15.
 */
public class InternetReader extends Reader {
    InternetReader(String url){
        super(url);
    }

    @Override
    protected String read() {
        return "czytam z www"+url;
    }
}
