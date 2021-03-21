package RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbolRegex = "[^\\d]+";
        String intRegex = "[\\d]+";
        String input = sc.nextLine();
        Pattern patternSymbol = Pattern.compile(symbolRegex);
        Pattern patternInt = Pattern.compile(intRegex);
        Matcher matcherSymbol = patternSymbol.matcher(input);
        Matcher matcherInt = patternInt.matcher(input);
        StringBuilder result = new StringBuilder();
        while(matcherSymbol.find()){
            String matherString = matcherSymbol.group().toUpperCase();

            if(matcherInt.find()) {
                int repeating = Integer.parseInt(matcherInt.group());
                for (int i = 0; i < repeating; i++) {
                    result.append(matherString);
                }
            }
        }
        System.out.printf("Unique symbols used: %d%n", result.chars().distinct().count());
        System.out.println(result);
    }
}
