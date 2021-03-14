package TextProcessing.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wordToRemove = sc.nextLine();
        String input = sc.nextLine();

        while (input.contains(wordToRemove)){
            input = removeOccurrence(input, wordToRemove);
        }
        System.out.println(input);
    }

    private static String removeOccurrence(String input, String wordToRemove) {
        int beginIndex = input.indexOf(wordToRemove);
        int endIndex = beginIndex + wordToRemove.length();
        return input.substring(0, beginIndex) + input.substring(endIndex);
    }
}
