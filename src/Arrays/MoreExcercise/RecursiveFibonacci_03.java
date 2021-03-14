package Arrays.MoreExcercise;

import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibNumber = Integer.parseInt(sc.nextLine());
        System.out.println(fibonacci(fibNumber));

    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

