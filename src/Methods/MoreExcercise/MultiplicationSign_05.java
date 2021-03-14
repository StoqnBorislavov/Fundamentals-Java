package Methods.MoreExcercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        findMultiplicationSign(firstNumber, secondNumber, thirdNumber);
    }

    private static void findMultiplicationSign(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 00) {
            System.out.println("zero");
            return;
        }  if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0 ||
                firstNumber < 0 && secondNumber < 0 & thirdNumber > 0 ||
                firstNumber < 0 && thirdNumber < 0 && secondNumber > 0 ||
                secondNumber < 0 && thirdNumber < 0 && firstNumber > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
