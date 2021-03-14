package Methods.Lab;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printSignOfInteger(n);
    }

    private static void printSignOfInteger(int number) {
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }

    }
}
