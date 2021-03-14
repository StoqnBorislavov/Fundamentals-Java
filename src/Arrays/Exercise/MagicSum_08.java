package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.length - 1; i++) {
            int number = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if((number + numbers[j] == sum)){
                    System.out.printf("%d %d%n", number, numbers[j]);
                }
            }
        }
    }
}
