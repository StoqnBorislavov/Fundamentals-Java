package TextProcessing.Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = sc.nextLine().split(", ");


        for (int i = 0; i < usernames.length; i++) {
            String username = usernames[i];
            boolean isValid = true;
            if (username.length() >= 3 && username.length() <= 16) {
                for (int j = 0; j < username.length(); j++) {
                    char currentSymbol = username.charAt(j);
                    if (Character.isAlphabetic(currentSymbol)) {
                    } else if (Character.isDigit(currentSymbol)) {
                    } else if (currentSymbol == '-') {
                    } else if (currentSymbol == '_') {
                    } else {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    System.out.println(username);
                }
            }
        }
    }
}

