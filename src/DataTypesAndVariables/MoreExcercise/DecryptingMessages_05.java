package DataTypesAndVariables.MoreExcercise;

import java.util.Scanner;

public class DecryptingMessages_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.nextLine());

        int lines = Integer.parseInt(sc.nextLine());
        String message = "";
        char decryptedChar;
        for (int i = 0; i < lines; i++) {
            char c = sc.nextLine().charAt(0);
            decryptedChar = (char)(c + key);
            message += decryptedChar;
        }
        System.out.println(message);
    }
}
