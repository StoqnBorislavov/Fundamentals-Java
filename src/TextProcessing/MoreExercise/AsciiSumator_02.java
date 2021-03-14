package TextProcessing.MoreExercise;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);
        String input = sc.nextLine();
        int sumOfChars = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (first < currentCharacter && currentCharacter < second) {
                sumOfChars += (int) currentCharacter;
            }
        }
        System.out.println(sumOfChars);
    }
}
