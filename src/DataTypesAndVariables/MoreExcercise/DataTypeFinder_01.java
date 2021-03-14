package DataTypesAndVariables.MoreExcercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("END")) {
            if (command.equalsIgnoreCase("true") || command.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", command);
            } else if (command.length() == 1) {
                if (command.charAt(0) <= 47 || command.charAt(0) >= 58) {
                    System.out.printf("%s is character type%n", command);
                } else {
                    System.out.printf("%s is integer type%n", command);
                }
            } else {
                boolean isFloat = false;
                boolean isString = false;
                for (int i = 0; i < command.length(); i++) {
                    char currentSymbol = command.charAt(i);
                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }
                    if (currentSymbol == 46) {
                        isFloat = true;

                    }
                }
                if (isString) {
                    System.out.printf("%s is string type%n", command);
                } else {
                    if (isFloat) {
                        System.out.printf("%s is floating point type%n", command);
                    } else {
                        System.out.printf("%s is integer type%n", command);
                    }
                }
            }
            command = sc.nextLine();
        }
    }
}

