package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> neighborhood = Arrays.stream(sc.nextLine().split("@"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String input = sc.nextLine();
        int lastPositionIndex = 0;
        while (!input.equals("Love!")) {
            int length = Integer.parseInt(input.split("\\s+")[1]);
            int fullLength = length + lastPositionIndex;
            if (fullLength > neighborhood.size() - 1) {
                fullLength = 0;
            }
            if (neighborhood.get(fullLength) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", fullLength);
                lastPositionIndex = fullLength;
            } else if (neighborhood.get(fullLength) - 2 <= 0) {
                System.out.printf("Place %d has Valentine's day.%n", fullLength);
                neighborhood.set(fullLength, 0);
                lastPositionIndex = fullLength;
            } else {
                neighborhood.set(fullLength, neighborhood.get(fullLength) - 2);
                lastPositionIndex = fullLength;
            }
            input = sc.nextLine();
        }
        int houseCount = 0;
        for (Integer house : neighborhood) {
            if (house == 0) {
                houseCount++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", lastPositionIndex);
        if (houseCount == neighborhood.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", neighborhood.size() - houseCount);
        }
    }
}
