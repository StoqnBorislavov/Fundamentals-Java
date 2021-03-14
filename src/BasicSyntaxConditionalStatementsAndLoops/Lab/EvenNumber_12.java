package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenNumber = Integer.parseInt(sc.nextLine());
        while (true){
            if(evenNumber % 2 == 0){
                System.out.printf("The number is: %d%n", Math.abs(evenNumber));
                break;
            } else{
                System.out.println("Please write an even number.");
            }
            evenNumber = Integer.parseInt(sc.nextLine());
        }
    }
}
