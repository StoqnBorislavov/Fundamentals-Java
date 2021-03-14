package Methods.Excercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("END")) {
            printIfNumberIsPalindrome(command);
            command = sc.nextLine();
        }
    }

    private static void printIfNumberIsPalindrome(String command) {
        boolean isPalindrome = true;
        for (int i = 0; i < command.length() / 2; i++) {
            if (command.charAt(i) != command.charAt(command.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
