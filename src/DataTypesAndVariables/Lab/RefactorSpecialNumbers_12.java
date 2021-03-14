package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number = i;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            boolean isSpecial = false;
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else{
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
