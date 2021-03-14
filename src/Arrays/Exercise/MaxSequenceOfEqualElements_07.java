package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sequenceCount = 0;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (number == numbers[j]) {
                    sequenceCount++;
                } else {
                    break;
                }
            }
            if (sequenceCount > maxCount) {
                maxCount = sequenceCount;
                index = i;
            }
            sequenceCount = 0;
        }
        for (int i = index; i < index + maxCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
