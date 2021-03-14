package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            if (deck1.get(0) > deck2.get(0)) {
                deck1.add(deck1.get(0));
                deck1.add((deck2.get(0)));
                deck1.remove(0);
                deck2.remove(0);
            } else if (deck1.get(0) < deck2.get(0)) {
                deck2.add(deck2.get(0));
                deck2.add((deck1.get(0)));
                deck1.remove(0);
                deck2.remove(0);
            } else{
                deck1.remove(0);
                deck2.remove(0);
            }
        }
        int sum = 0;
        if (!deck1.isEmpty()) {
            for (Integer card : deck1) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!deck2.isEmpty()) {
            for (Integer card : deck2) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
