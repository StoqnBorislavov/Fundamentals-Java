package Methods.Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(sc.nextLine());
                int secondNumber = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    private static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    private static char getMax(char firstChar, char secondChar) {
        if (firstChar >= secondChar) {
            return firstChar;
        }
        return secondChar;
    }

    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }
}
