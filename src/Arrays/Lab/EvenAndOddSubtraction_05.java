package Arrays.Lab;

import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrInString = sc.nextLine().split(" ");
        int[] arrInInt = new int[arrInString.length];
        for (int i = 0; i < arrInString.length; i++) {
            arrInInt[i] = Integer.parseInt(arrInString[i]);
        }
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < arrInInt.length; i++) {
            if (arrInInt[i] % 2 == 0) {
                sumOfEven += arrInInt[i];
            } else {
                sumOfOdd += arrInInt[i];
            }
        }
        System.out.println(sumOfEven - sumOfOdd);
    }
}
