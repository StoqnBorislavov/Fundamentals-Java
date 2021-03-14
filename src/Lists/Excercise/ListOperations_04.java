package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToAdd1 = Integer.parseInt(tokens[1]);
                    int indexToAdd = Integer.parseInt(tokens[2]);
                    if (isValidIndex(indexToAdd, numbers.size())) {
                        numbers.add(indexToAdd, numberToAdd1);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexForRemove = Integer.parseInt(tokens[1]);
                    if (isValidIndex(indexForRemove, numbers.size())) {
                        numbers.remove(indexForRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if(direction.equals("right")){
                        for (int i = 0; i < count; i++) {
                            int lastNumber = numbers.get(numbers.size() -1);
                            numbers.remove(numbers.size() -1);
                            numbers.add(0, lastNumber);
                        }
                    } else if(direction.equals("left")){
                        for (int i = 0; i < count; i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);
                        }
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }
}
