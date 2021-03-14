package TextProcessing.Lab;

import java.sql.Struct;
import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] forbiddenWords = sc.nextLine().split(", ");
        String input = sc.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if(input.contains(forbiddenWord)){
                String wordOfStars = convertWordToStars(forbiddenWord);
                input = input.replace(forbiddenWord, wordOfStars);
            }
        }
        System.out.println(input);
    }

    private static String convertWordToStars(String forbiddenWord) {
        StringBuilder wordOfStars = new StringBuilder();
        for (int i = 0; i < forbiddenWord.length(); i++) {
            wordOfStars.append("*");
        }
        return  wordOfStars.toString();
    }
}
