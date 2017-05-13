package reader;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by RENT on 2017-02-15.
 */

public abstract class Reader {
    protected String url;
    Reader(String url){
        this.url=url;
    }
    public String getPage() {
        System.out.println(read());
        System.out.println("parsing");
        return "web page";
    }

    protected abstract String read();
}
