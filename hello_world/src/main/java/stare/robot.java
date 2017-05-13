/**
 * Created by RENT on 2017-02-08.
 */
public class robot {


    public static void main(String[] args) {
        String commands = "PMMLPMMMMMLPMMMMMLPMMMMMLPMMMMMLPMMMMMLPMMMMML";
        int[] table = new int[10];
        int collumn = 0;
        int space = 15;
        int lifted = 0;
        char[] commandToChar = commands.toCharArray();
        for (int i = 0; i < commandToChar.length; i++) {
            if (commandToChar[i] == 'L') {
                if (lifted==1 && table[collumn]<space){
                    table[collumn]++;
                    lifted--;
                }
            } else if (commandToChar[i] == 'M') {
                if (collumn < 15) {
                    collumn++;
                } else
                    System.out.println("I cannot move forward");
            } else if (commandToChar[i] == 'P') {
                collumn = 0;
                if (lifted == 0)
                    lifted = 1;
            } else
                System.out.println("Nie znana komenda");
        }
        for(int current: table){
            System.out.println(current);
        }

    }
}
