package TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] key = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        StringBuilder massage = new StringBuilder(sc.nextLine());
        while (!massage.toString().equals("find")) {
            int p = 0;
            for (int i = 0; i < massage.length(); i++) {
                char currentChar = massage.charAt(i);
                if (p > key.length - 1) {
                    p -= key.length;
                }
                int newKey = key[p];
                char newChar = (char) (currentChar - newKey);
                massage.replace(i, i + 1, newChar + "");
                p++;
            }
            int startTreasureIndex = massage.indexOf("&");
            int endTreasureIndex = massage.lastIndexOf("&");
            int startCoordinate = massage.indexOf("<");
            int endCoordinate = massage.lastIndexOf(">");
            String treasure = massage.substring(startTreasureIndex + 1, endTreasureIndex);
            String coordinate = massage.substring(startCoordinate + 1, endCoordinate);
            System.out.printf("Found %s at %s%n", treasure, coordinate);
            massage = new StringBuilder(sc.nextLine());
        }
    }
}
