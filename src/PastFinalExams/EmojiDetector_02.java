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
        String emojiRegex = "([:*]{1})\\1[A-Z][a-z][a-z]+(\\1)(\\1)";

        String input = sc.nextLine();
        Pattern patternThreshold = Pattern.compile(regexForThreshold);
        Pattern patternEmoji = Pattern.compile(emojiRegex);
        Matcher matcherThreshold = patternThreshold.matcher(input);
        Matcher matcherEmoji = patternEmoji.matcher(input);

        BigDecimal coolThreshold = new BigDecimal(1);
        while (matcherThreshold.find()) {
            int number = Integer.parseInt(matcherThreshold.group());
            coolThreshold = coolThreshold.multiply(new BigDecimal(number));
        }
        int emojiCount = 0;
        List<String> emojis = new ArrayList<>();
        while (matcherEmoji.find()) {
            emojiCount++;
            long currentCoolness = foundTheCoolness(matcherEmoji.group());
            int comparing = coolThreshold.compareTo(new BigDecimal(currentCoolness));
            if (comparing == -1 || comparing == 0) {
                emojis.add(matcherEmoji.group());
            }
        }
        if(!coolThreshold.equals(new BigDecimal(0))) {
            System.out.println("Cool threshold: " + coolThreshold);
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCount);
        if(!coolThreshold.equals(new BigDecimal(0))) {
            for (int i = 0; i < emojis.size(); i++) {
                System.out.println(emojis.get(i));
            }
        }

    }

    private static long foundTheCoolness(String emoji) {
        String cool = emoji.substring(2, emoji.length() - 2);
        long coolness = 0L;
        for (int i = 0; i < cool.length(); i++) {
            char current = cool.charAt(i);
            coolness += current;
        }
        return coolness;
    }
}
