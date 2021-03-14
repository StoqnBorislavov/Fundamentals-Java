package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += calculateSum(input[i]);
        }
        System.out.printf("%.2f", sum);
    }

    private static double calculateSum(String input) {
        double totalSum = 0;
        char firstLetter = input.charAt(0);
        char lastLetter = input.charAt(input.length() - 1);
        int numberBetweenToChars = Integer.parseInt(input.substring(1, input.length() - 1));
        if (firstLetter >= 'a' && firstLetter <= 'z') {
            totalSum = numberBetweenToChars * 1.0 * (firstLetter - 96);
        } else {
            totalSum = numberBetweenToChars * 1.0 / (firstLetter - 64);
        }
        if (lastLetter >= 'a' && lastLetter <= 'z') {
            totalSum += (lastLetter - 96);
        } else {
            totalSum -= (lastLetter - 64);
        }
        return totalSum;
    }
}
