package RegularExpressions.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexName = "[^\\d\\*\\.\\-\\+ \\/, ]";
        String regexDamage = "[+-]?\\d+\\.?\\d*";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDamage = Pattern.compile(regexDamage);

        List<String> names = Arrays.stream(sc.nextLine().split(",\\s*"))
                .sorted(String::compareTo).collect(Collectors.toList());

            // iterating through all demons

        for (String name : names) {
            Matcher matcherName = patternName.matcher(name);
            int health = 0;
            // calculating the health points
            while (matcherName.find()) {
                health += matcherName.group().charAt(0);
            }
            // calculating the damage

            Matcher matcherDamage = patternDamage.matcher(name);
            double damage = 0;
            while (matcherDamage.find()) {
                damage += Double.parseDouble(matcherDamage.group());
            }
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == '*') {
                    damage *= 2;
                } else if (name.charAt(i) == '/' && damage != 0) {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", name.trim(), health, damage);
        }
    }
}
