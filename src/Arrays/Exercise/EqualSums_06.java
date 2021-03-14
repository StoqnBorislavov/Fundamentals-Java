package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isFound = false;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int leftIndex = 0; leftIndex <= i - 1; leftIndex++) {
                sumLeft += numbers[leftIndex];
            }
            for (int rightIndex = i + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                sumRight += numbers[rightIndex];
            }
            if (sumLeft == sumRight) {
                System.out.print(i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
