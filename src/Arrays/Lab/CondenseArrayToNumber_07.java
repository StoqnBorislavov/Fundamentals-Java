package Arrays.Lab;

import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrInString = sc.nextLine().split(" ");
        int[] numbers = new int[arrInString.length];
        for (int i = 0; i < arrInString.length; i++) {
            numbers[i] = Integer.parseInt(arrInString[i]);
        }
        while (numbers.length > 1) {
            int[] condense = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condense[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condense;
        }
        System.out.println(numbers[0]);
    }
}
