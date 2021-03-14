package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberForStart = Integer.parseInt(sc.nextLine());
        int numberForEnd = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = numberForStart; i <= numberForEnd; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
