package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrInString = sc.nextLine().split(" ");
        int[] arrInInt = new int[arrInString.length];
        for (int i = 0; i < arrInString.length; i++) {
            arrInInt[i] = Integer.parseInt(arrInString[i]);
        }
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < arrInInt.length; i++) {
            if (arrInInt[i] % 2 == 0) {
                sumOfEvenNumbers += arrInInt[i];
            }
        }
        System.out.println(sumOfEvenNumbers);
    }
}
