package Methods.Excercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstChar = sc.nextLine().charAt(0);
        char secondChar = sc.nextLine().charAt(0);

        printCharBetweenAB(firstChar, secondChar);
    }

    private static void printCharBetweenAB(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.printf("%c ", i);
            }

        }
    }
}
