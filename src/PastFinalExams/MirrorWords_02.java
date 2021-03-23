package PastFinalExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "([#@])[a-zA-Z]{3,}\\1\\1[a-zA-Z]{3,}\\1";
        Pattern pattern = Pattern.compile(regex);
        String input = sc.nextLine();
        List<String> mirrorWords = new ArrayList<>();
        int counter = 0;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            counter++;
            String firstPart = matcher.group().split("##|@@")[0];
            String first = firstPart.substring(1);
            String secondPart = matcher.group().split("##|@@")[1];
            String second = secondPart.substring(0, secondPart.length() - 1);
            StringBuilder reversedSecond = new StringBuilder(second);
            if (first.equals(reversedSecond.reverse().toString())) {
                mirrorWords.add(first);
            }
        }
        if (counter != 0) {
            System.out.printf("%d word pairs found!%n", counter);
            if (!mirrorWords.isEmpty()) {
                System.out.println("The mirror words are:");
                for (int i = 0; i < mirrorWords.size(); i++) {
                    StringBuilder reversedPair = new StringBuilder(mirrorWords.get(i));
                    if (i == mirrorWords.size() - 1) {
                        System.out.printf("%s <=> %s", mirrorWords.get(i), reversedPair.reverse().toString());
                    } else {
                        System.out.printf("%s <=> %s, ", mirrorWords.get(i), reversedPair.reverse().toString());
                    }
                }
            } else {
                System.out.println("No mirror words!");
            }
        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
        System.out.println();
    }
}
