/**
 * Created by andre on 08.03.2017.
 */
public class AlfabetMorsa {
    public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " "};
    public static String[] dottie = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|"};

    public static String zamianaNaMorsa(String old) {
        old=old.toLowerCase();
        String[] split = old.split("");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (split[i].equals(alpha[j])) {
                    split[i] = dottie[j];
                }
            }
        }
        StringBuilder nowy = new StringBuilder();
        String out = new String();
        for (String el : split) {
            nowy.append(el);
        }
        out = nowy.toString();
        return out;
    }


    public static void main(String[] args) {
        String nowa="NNNN";
        System.out.println(zamianaNaMorsa(nowa));
        if (args.length > 0){
            System.out.println(zamianaNaMorsa(args[0]));

        }
    }

}
