package Arrays.Lab;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArrInStr = sc.nextLine().split(" ");
        String[] secondArrInStr = sc.nextLine().split(" ");
        int[] firstArrInInt = new int[firstArrInStr.length];
        int[] secondArrInInt = new int[secondArrInStr.length];

        for (int i = 0; i < firstArrInStr.length; i++) {
            firstArrInInt[i] = Integer.parseInt(firstArrInStr[i]);
            secondArrInInt[i] = Integer.parseInt(secondArrInStr[i]);
        }
        boolean areEqual = true;
        int sumOfArr = 0;
        for (int i = 0; i < firstArrInInt.length; i++) {
            sumOfArr += firstArrInInt[i];
            if (firstArrInInt[i] != secondArrInInt[i]) {
                areEqual = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sumOfArr);
        }
    }
}
