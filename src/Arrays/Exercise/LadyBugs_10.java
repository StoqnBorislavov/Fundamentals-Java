package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] ladyBugs = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number >= 0 && number < ladyBugs.length) {
                ladyBugs[number] = 1;
            }
        }
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] comString = command.split(" ");
            int ladybugIndex = Integer.parseInt(comString[0]);
            String direction = comString[1];
            int flyLength = Integer.parseInt(comString[2]);
            if (ladybugIndex >= 0 && ladybugIndex < ladyBugs.length && ladyBugs[ladybugIndex] == 1) {
                ladyBugs[ladybugIndex] = 0;
                if (direction.equals("right")) {
                    ladybugIndex += flyLength;
                    while (ladybugIndex < ladyBugs.length && ladyBugs[ladybugIndex] == 1) {
                        ladybugIndex += flyLength;
                    }
                    if (ladybugIndex < ladyBugs.length) {
                        ladyBugs[ladybugIndex] = 1;
                    }

                } else if (direction.equals("left")) {
                    ladybugIndex -= flyLength;
                    while (ladybugIndex >= 0 && ladyBugs[ladybugIndex] == 1) {
                        ladybugIndex -= flyLength;
                    }
                    if (ladybugIndex >= 0) {
                        ladyBugs[ladybugIndex] = 1;
                    }
                }
            }
            command = sc.nextLine();
        }
        for (int i = 0; i < ladyBugs.length; i++) {
            System.out.print(ladyBugs[i] + " ");
        }
    }
}

