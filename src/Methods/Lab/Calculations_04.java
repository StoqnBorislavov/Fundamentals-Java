package Methods.Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mathOperation = sc.nextLine();
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        switch (mathOperation) {
            case "add":
                printResultFromAddOperation(firstNumber, secondNumber);
                break;
            case "multiply":
                printResultFromMultiplyOperation(firstNumber, secondNumber);
                break;
            case "subtract":
                printResultFromSubtractOperation(firstNumber, secondNumber);
                break;
            case "divide":
                printResultFromDivideOperation(firstNumber, secondNumber);
                break;
        }
    }

    private static void printResultFromDivideOperation(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        printResult(result);
    }

    private static void printResultFromSubtractOperation(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        printResult(result);
    }

    private static void printResultFromMultiplyOperation(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        printResult(result);
    }

    private static void printResultFromAddOperation(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
