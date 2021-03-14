package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i <= numbers.length - 1; i++) {
            int number = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(number);
                break;
            }
            boolean isBigger = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (number > numbers[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(number + " ");
            }
        }
    }
}
