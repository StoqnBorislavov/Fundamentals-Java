package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String input = sc.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];
            int index = Integer.parseInt(input.split("\\s+")[1]);
            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(input.split("\\s+")[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(input.split("\\s+")[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split("\\s+")[2]);
                    int startIndex = index - radius;
                    int endIndex = index + radius;
                    if (index - radius >= 0 && index >= 0 && index < targets.size()
                            && index + radius < targets.size()) {
                        int count = 0;
                        for (int i = startIndex; i <= endIndex - count; i++) {
                            targets.remove(i);
                            count++;
                            i--;
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }
}
