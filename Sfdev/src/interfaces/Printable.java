package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public interface Printable {
    void proint();
    void printShort();
    default void sone(){
        System.out.println("");
    }
}
