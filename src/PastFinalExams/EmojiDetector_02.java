package PastFinalExams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexForThreshold = "[\\d]";
        String emojiRegex = "(?<separator>[:\\*])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1";

        String input = sc.nextLine();
        Pattern patternThreshold = Pattern.compile(regexForThreshold);
        Pattern patternEmoji = Pattern.compile(emojiRegex);
        Matcher matcherThreshold = patternThreshold.matcher(input);
        Matcher matcherEmoji = patternEmoji.matcher(input);

        long coolThreshold = 1;
        while (matcherThreshold.find()) {
            int number = Integer.parseInt(matcherThreshold.group());
            coolThreshold *= Integer.parseInt(matcherThreshold.group());
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        int emojiCount = 0;
        List<String> emojis = new ArrayList<>();
        while (matcherEmoji.find()) {
            emojiCount++;
            String separator = matcherEmoji.group("separator");
            String emojiText = matcherEmoji.group("emoji");
            long currentCoolness = foundTheCoolness(emojiText);
            if (currentCoolness >= coolThreshold) {
                String newEmoji = separator + separator + emojiText + separator + separator;
                emojis.add(newEmoji);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCount);
        emojis.stream().forEach(System.out::println);

    }

    private static int foundTheCoolness(String emoji) {
        int coolness = 0;
        for (int i = 0; i < emoji.length(); i++) {
            char current = emoji.charAt(i);
            coolness += current;
        }
        return coolness;
    }
}
