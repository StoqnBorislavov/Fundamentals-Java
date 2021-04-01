package RegularExpressions.MoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PostOffice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());
        String firstPart = input.get(0);
        String secondPart = input.get(1);
        List<String> words = Arrays.stream(input.get(2).split("\\s+")).collect(Collectors.toList());
        String regexForFirstPart = "([#$%*&])(?<letters>[A-Z]+)\\1";
        Pattern pattern = Pattern.compile(regexForFirstPart);
        Matcher matcher = pattern.matcher(firstPart);
        Map<String, Integer> map = new LinkedHashMap<>();
        if (matcher.find()) {
            String chars = matcher.group("letters");
            for (int i = 0; i < chars.length(); i++) {
                char current = chars.charAt(i);
                map.put(current + "", 0);
            }
        }
        String regexForSecondPart = "(?<char>[6-9][0-9]):(?<length>[0-9]{2})";
        Pattern pattern1 = Pattern.compile(regexForSecondPart);
        Matcher matcher1 = pattern1.matcher(secondPart);
        while (matcher1.find()) {
            int currentChar = Integer.parseInt(matcher1.group("char"));
            int length = Integer.parseInt(matcher1.group("length"));
            String currentString = (char) currentChar + "";
            if (map.containsKey(currentString) && map.get(currentString) == 0) {
                map.put(currentString, length + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String currentStartChar = entry.getKey();
            int lengthOfWord = entry.getValue();
            for (String word : words) {
                if ((word.charAt(0) + "").equals(currentStartChar) && word.length() == lengthOfWord) {
                    System.out.println(word);
                    break;
                }

            }

        }

    }
}
