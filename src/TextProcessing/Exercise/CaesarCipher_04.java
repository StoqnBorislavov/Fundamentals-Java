package TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        encryptedInput(input);
    }

    private static void encryptedInput(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int currentChar = (char)input.charAt(i);
            result.append((char)(currentChar + 3));
        }
        System.out.println(result);
    }
}
