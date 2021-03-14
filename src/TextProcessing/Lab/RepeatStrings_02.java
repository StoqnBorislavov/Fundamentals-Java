package TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        for (String word : words) {
            // Повтаряме думата и я принтираме
            String repeatedWord = repeatWord(word, word.length());
            System.out.print(repeatedWord);
        }
    }

    private static String repeatWord(String word, int numberOfRepetition) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRepetition; i++) {
            result.append(word);
        }
        return result.toString();

    }
}
