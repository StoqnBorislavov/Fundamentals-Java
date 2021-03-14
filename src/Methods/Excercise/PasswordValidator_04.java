package Methods.Excercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        checkingTheGivenPassword(password);
    }

    private static void checkingTheGivenPassword(String password) {
        boolean countDigit = checkingTheNumberOfDigits(password);
        boolean checkTypeOfDigit = checkingTheTypeOfDigits(password);
        int numberOfDigits = checkingCountOfNumbers(password);
        if (countDigit && checkTypeOfDigit && numberOfDigits >= 2) {
            System.out.println("Password is valid");
        }
    }

    private static int checkingCountOfNumbers(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c > 47 && c < 58) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        return count;
    }

    private static boolean checkingTheTypeOfDigits(String password) {
        boolean isRight = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c < 48 || c > 57 && c < 65 || c > 90 && c < 97 || c > 122) {
                System.out.println("Password must consist only of letters and digits");
                isRight = false;
                break;
            }
        }
        return isRight;
    }

    private static boolean checkingTheNumberOfDigits(String password) {
        boolean isRight = true;
        if (password.length() <= 6 || password.length() >= 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isRight = false;
        }
        return isRight;
    }
}
