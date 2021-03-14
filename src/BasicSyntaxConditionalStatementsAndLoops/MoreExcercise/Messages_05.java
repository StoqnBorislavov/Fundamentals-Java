package BasicSyntaxConditionalStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        StringBuilder sms = new StringBuilder();
        char character;
        for (int i = 0; i < number; i++) {
            int digit = Integer.parseInt(sc.nextLine());
            int mainDigit = digit % 10;
            int numberOfDigits = 0;
            while (digit > 0) {
                digit = digit / 10;
                numberOfDigits++;
            }
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + numberOfDigits - 1;
            if (mainDigit == 0) {
                letterIndex = 32;
                character = (char) (letterIndex);
            } else {
                character = (char) (97 + letterIndex);
            }
            sms.append(character);
        }
        System.out.println(sms.toString());
    }
}

