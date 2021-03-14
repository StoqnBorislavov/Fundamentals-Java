package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        int movesCount = 0;

        String command = sc.nextLine();

        while (!command.equals("end")) {
            movesCount++;
            int firstIndex = Integer.parseInt(command.split("\\s+")[0]);
            int secondIndex = Integer.parseInt(command.split("\\s+")[1]);
            if (firstIndex < 0 || firstIndex >= numbers.size()) {
                String newElement = String.format("-%da", movesCount);
                for (int i = 0; i < 2; i++) {
                    numbers.add(numbers.size() / 2, newElement);
                }
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (secondIndex < 0 || secondIndex >= numbers.size()) {
                String newElement = String.format("-%da", movesCount);
                for (int i = 0; i < 2; i++) {
                    numbers.add(numbers.size() / 2, newElement);
                }
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (numbers.get(firstIndex).equals(numbers.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", numbers.get(firstIndex));
                    String element = numbers.get(firstIndex);
                    for (int i = 0; i < 2; i++) {
                        numbers.remove(element);
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", movesCount);
                return;
            }
            command = sc.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
