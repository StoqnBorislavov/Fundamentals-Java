package Methods.MoreExcercise;

import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        tribonacciSequence(num);
    }

    private static void tribonacciSequence(int num) {
        int[] tribonacciArr = new int[num];
        if(num > 2) {
            tribonacciArr[0] = 1;
            tribonacciArr[1] = 1;
            tribonacciArr[2] = 2;
            for (int i = 3; i < tribonacciArr.length; i++) {
                tribonacciArr[i] = tribonacciArr[i - 1] + tribonacciArr[i - 2] + tribonacciArr[i - 3];
            }
        } else if (num >= 0 && num <= 2) {
            for (int i = 0; i < tribonacciArr.length; i++) {
                tribonacciArr[i] = 1;
            }
        }
        for (int i = 0; i < tribonacciArr.length; i++) {
            System.out.print(tribonacciArr[i] + " ");

        }
    }
}
