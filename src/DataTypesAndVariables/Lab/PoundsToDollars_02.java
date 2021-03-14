package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = Double.parseDouble(sc.nextLine());
        double exchangeRate = 1.31;
        double dollars = pounds * exchangeRate;
        System.out.printf("%.3f", dollars);
    }
}
