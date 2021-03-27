package PastFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String regex = "([#\\|])(?<item>[a-zA-Z ]+)\\1(?<expiration>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern = Pattern.compile(regex);

        int calories = 0;
        Matcher matcher = pattern.matcher(input);
        Matcher matcherForItems = pattern.matcher(input);
        while (matcher.find()) {
            calories += Integer.parseInt(matcher.group("calories"));
        }
        System.out.printf("You have food to last you for: %d days!%n", calories / 2000);

        while (matcherForItems.find()) {
            String item = matcherForItems.group("item");
            String expiration = matcherForItems.group("expiration");
            int cal = Integer.parseInt(matcherForItems.group("calories"));
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", item, expiration, cal);
        }
    }
}
