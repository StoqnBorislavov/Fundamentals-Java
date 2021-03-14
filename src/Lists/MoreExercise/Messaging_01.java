package Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        String text = sc.nextLine();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            int sumOfItsDigits = 0;
            while (number > 0) {
                sumOfItsDigits = sumOfItsDigits + (number % 10);
                number /= 10;
            }
            while (sumOfItsDigits > text.length() - 1) {
                sumOfItsDigits -= text.length();
            }
            System.out.printf("%c", text.charAt(sumOfItsDigits));
            StringBuilder str = new StringBuilder();
            str.append(text);
            str.deleteCharAt(sumOfItsDigits);
            text = str.toString();
        }
    }
}
