package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable20_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        do {
            System.out.printf("%d X %d = %d%n", n, p, n * p);
            p++;
        } while (p <= 10);
    }
}
