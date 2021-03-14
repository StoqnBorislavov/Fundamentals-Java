package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secondNumber = Integer.parseInt(sc.nextLine());
        switch (operator){
            case "+":
                System.out.println(getSumOfToNumbers(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(getSubtractOfToNumbers(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(getMultiplyToNumbers(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(new DecimalFormat("0.##").format(getDivideToNumbers(firstNumber, secondNumber)));
                break;
        }
    }

    private static double getDivideToNumbers(int firstNumber, int secondNumber) {
        return 1.0 * firstNumber / secondNumber;
    }

    private static int getMultiplyToNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int getSubtractOfToNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int getSumOfToNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
