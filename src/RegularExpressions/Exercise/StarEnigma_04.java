package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<String>> typePlanets = new HashMap<>();
        typePlanets.put("A", new ArrayList<>());
        typePlanets.put("D", new ArrayList<>());
        String regex = "[^\\@\\-\\!\\:\\>]*@[^\\@\\-\\!\\:\\>]*?(?<town>[a-zA-Z]+)([^\\@\\-\\!\\:\\>]+)?:[^\\@\\-\\!\\:\\>]*?(?<population>\\d+)[^\\@\\-\\!\\:\\>]*?![^\\@\\-\\!\\:\\>]*?(?<type>[AD])[^\\@\\-\\!\\:\\>]*?![^\\@\\-\\!\\:\\>]*?->[^\\@\\-\\!\\:\\>]*?(?<soldiers>\\d+)([^\\@\\-\\!\\:\\>]+)?";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            int counter = 0;
            String decryptedMassage = "";
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                //[s, t, a, r]

                if (currentChar == 's' || currentChar == 'S' || currentChar == 't' || currentChar == 'T'
                        || currentChar == 'a' || currentChar == 'A' || currentChar == 'r' || currentChar == 'R') {
                    counter++;
                }
            }
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                char newChar = (char) ((int) currentChar - counter);
                decryptedMassage += newChar;
            }
            Matcher matcher = pattern.matcher(decryptedMassage);
            if (matcher.find()) {
                String newTown = matcher.group("town");
                if (matcher.group("type").equals("A")) {
                    typePlanets.get("A").add(newTown);
                } else {
                    typePlanets.get("D").add(newTown);
                }
            }

        }
        System.out.printf("Attacked planets: %d%n", typePlanets.get("A").size());
        typePlanets.get("A").stream()
                .sorted(String::compareTo)
                .forEach(town -> System.out.println("-> " + town));
        System.out.printf("Destroyed planets: %d%n", typePlanets.get("D").size());
        typePlanets.get("D").stream()
                .sorted(String::compareTo)
                .forEach(town -> System.out.println("-> " + town));
    }
}
