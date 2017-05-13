package innezadania;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-13.
 */
public class BMI extends Osoba {
    private double bmi;

    public void wyliczBmi(int height, int weight) {
        bmi = (double) weight / height / height * 10000;
    }

    public String toString() {
        return "twoje bmi to: " + bmi;
    }

    BMI(int height, int weight) {
        super(height, weight);
    }

    public static void main(String[] args) {
        System.out.println("podaj wzrost");
        Scanner input = new Scanner(System.in);
        int a, b;
        a=input.nextInt();
        b=input.nextInt();
        BMI andre = new BMI(a, b);

        System.out.println(andre.getHeight());
        andre.wyliczBmi(andre.getHeight(), andre.getWeight());
        System.out.println(andre);
    }
}
