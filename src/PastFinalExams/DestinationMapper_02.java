package PastFinalExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destinationMap = sc.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(destinationMap);
        List<String> places = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String place = matcher.group("destination");
            travelPoints += place.length();
            places.add(place);
        }
        System.out.print("Destinations: ");
        for (int i = 0; i < places.size(); i++) {
            if (i == places.size() - 1) {
                System.out.print(places.get(i));
            } else {
                System.out.print(places.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
