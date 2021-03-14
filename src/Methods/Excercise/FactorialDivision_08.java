package Methods.Excercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        calculateTheDivisionOfTwoFactorials(firstNumber, secondNumber);
    }

    private static void calculateTheDivisionOfTwoFactorials(int firstNumber, int secondNumber) {
        double result = findFactorial(firstNumber) * 1.0/ findFactorial(secondNumber);
        System.out.printf("%.2f", result);
    }

    private static long findFactorial(int number) {
        long factorial = 1;
        if(number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
