/**
 * Created by RENT on 2017-02-13.
 */
public class Parametrz {
    String s2;
    public String wypiszString(String s1, String s2, String s3){
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        Parametrz nowyParam=new Parametrz();
        System.out.println(nowyParam.wypiszString("kop","asddsa","ddd"));
    }
}
