package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSymbols = Integer.parseInt(sc.nextLine());
        int sumOfChars = 0;
        for (int i = 0; i < numberOfSymbols; i++) {
            char symbol = sc.nextLine().charAt(0);
            sumOfChars = sumOfChars + (int)symbol;

        }
        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
