package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> racers = Arrays.stream(sc.nextLine()
                .split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersDistance = new LinkedHashMap<>();

        racers.forEach(racer -> racersDistance.put(racer, 0));
        String regexName = "[A-Za-z]+";
        String regexDistance = "[0-9]";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);
        String input = sc.nextLine();

        while (!input.equals("end of race")) {
            Matcher matcherName = patternName.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();

            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            String name = nameBuilder.toString();
            if (racersDistance.containsKey(name)) {
                int distance = 0;
                Matcher matcherDistance = patternDistance.matcher(input);
                while (matcherDistance.find()) {
                    distance += Integer.parseInt(matcherDistance.group());
                }
                racersDistance.put(name, racersDistance.get(name) + distance);

            }
            input = sc.nextLine();
        }

        List<String> finalNames = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("1st place: " + finalNames.get(0));
        System.out.println("2nd place: " + finalNames.get(1));
        System.out.println("3rd place: " + finalNames.get(2));

    }
}
