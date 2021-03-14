package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int sumFact = 0;
        int fact = 1;
        int number1 = number;
        while (number1 != 0) {
            int digit = number1 % 10;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sumFact += fact;
            number1 = number1/10;
            fact = 1;
        }
        if(sumFact == number){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
