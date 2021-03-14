package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        String[] tokens = sc.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(tokens[0]);
        int powerOfBomb = Integer.parseInt(tokens[1]);
        while(numbers.contains(bombNumber)) {
            int indexOfBombNumber = numbers.indexOf(bombNumber);
            int startingIndex = 0;
            int endingIndex = numbers.size() - 1;
            if (indexOfBombNumber - powerOfBomb >= 0) {
                startingIndex = indexOfBombNumber - powerOfBomb;
            }
            if (indexOfBombNumber + powerOfBomb <= numbers.size() - 1) {
                endingIndex = indexOfBombNumber + powerOfBomb;
            }
            int counter = 0;
            for (int i = startingIndex; i <= endingIndex - counter; i++) {
                numbers.remove(i);
                counter++;
                i--;
            }
        }
        int sumOfNumbers = 0;
        for (Integer number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println(sumOfNumbers);
    }
}
