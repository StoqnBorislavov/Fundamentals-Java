package PastMidExams;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double sumOfItemsWithoutTax = 0;
        while (!input.equals("regular") && !input.equals("special")) {
            double item = Double.parseDouble(input);
            if (item <= 0) {
                System.out.println("Invalid price!");
            } else {
                sumOfItemsWithoutTax += item;
            }
            input = sc.nextLine();
        }
        double priceWithTax = sumOfItemsWithoutTax * 1.2;
        double totalPrice = 0;
        if (input.equals("regular")) {
            totalPrice = priceWithTax;
        } else if (input.equals("special")) {
            totalPrice = priceWithTax * 0.9;
        }
        if (sumOfItemsWithoutTax == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$%n", sumOfItemsWithoutTax, priceWithTax - sumOfItemsWithoutTax, totalPrice);
        }
    }
}
