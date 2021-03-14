package Lists.Excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int index = Integer.parseInt(sc.nextLine());
        int sumOfRemovedElements = 0;
        while (!numbers.isEmpty()) {
            int number;
            if (index < 0) {
                number = numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));

                sumOfRemovedElements += number;

            } else if (index > numbers.size() - 1) {
                number = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));
                sumOfRemovedElements += number;
            } else {
                number = numbers.get(index);
                numbers.remove(index);
                sumOfRemovedElements += number;
            }

            for (int i = 0; i < numbers.size(); i++) {
                int currentElement = numbers.get(i);
                if (number < currentElement) {
                    numbers.set(i, numbers.get(i) - number);
                } else {
                    numbers.set(i, numbers.get(i) + number);
                }
            }
            if (!numbers.isEmpty()) {
                index = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(sumOfRemovedElements);
    }
}
