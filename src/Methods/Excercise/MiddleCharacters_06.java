package Methods.Excercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        printTheMiddleCharacter(text);
    }

    private static void printTheMiddleCharacter(String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt((text.length() / 2) - 1));
            System.out.print(text.charAt(text.length() / 2));
        } else {
            System.out.print(text.charAt(text.length() / 2));
        }
    }
}
