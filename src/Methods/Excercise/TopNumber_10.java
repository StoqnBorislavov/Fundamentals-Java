package Methods.Excercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        findTheTopIntegers(n);
    }

    private static void findTheTopIntegers(int endOfInterval) {
        for (int j = 1; j <= endOfInterval; j++) {
            int sumOfDigits = 0;
            boolean isOneOddDigit = false;
            int currentNumber = j;
            while (currentNumber > 0) {
                sumOfDigits = sumOfDigits + (currentNumber % 10);
                if (currentNumber % 2 == 1) {
                    isOneOddDigit = true;
                }
                currentNumber /= 10;
            }
            if (sumOfDigits % 8 == 0) {
                if (isOneOddDigit) {
                    System.out.println(j);
                }
            }
        }
    }
}
