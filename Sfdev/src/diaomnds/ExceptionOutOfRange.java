package diaomnds;

/**
 * Created by RENT on 2017-02-18.
 */
public class ExceptionOutOfRange extends RuntimeException {
    private int size;
    private int askedIndex;
    public ExceptionOutOfRange(int size, int askedIndex){
        this.size=size;
        this.askedIndex=askedIndex;
    }

    @Override
    public String getMessage() {
        return "you are out of your table"+size+" "+askedIndex;
    }
}
