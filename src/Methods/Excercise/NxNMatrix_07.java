package Methods.Excercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        printNxNmatrix(n);
    }

    private static void printNxNmatrix(int n) {
        for (int i = 0; i < n; i++) {
            printLineOfN(n);
        }
    }

    private static void printLineOfN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
