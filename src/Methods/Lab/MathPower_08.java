package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        printMathPower(number, power);

    }

    private static void printMathPower(double number, int power) {
        double result = Math.pow(number, power);

        System.out.println(new DecimalFormat("0.####").format(result));

    }
}
