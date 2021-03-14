package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().replaceAll(" ", "");

        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (occurrences.containsKey(currentCharacter)) {
                occurrences.put(currentCharacter, occurrences.get(currentCharacter) + 1);
            } else {
                occurrences.put(currentCharacter, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
