package Methods.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        switch (productName) {
            case "coffee":
                printPriceForCoffe(quantity);
                break;
            case "water":
                printPriceForWater(quantity);
                break;
            case "coke":
                printPriceOfCoke(quantity);
                break;
            case "snacks":
                printPriceForSnacks(quantity);
                break;
        }
    }

    private static void printPriceForSnacks(int quantity) {
        double result = quantity * 2.00;
        printResult(result);
    }

    private static void printPriceOfCoke(int quantity) {
        double result = quantity * 1.40;
        printResult(result);
    }

    private static void printPriceForWater(int quantity) {
        double result = quantity * 1.00;
        printResult(result);
    }

    private static void printPriceForCoffe(int quantity) {
        double result = quantity * 1.50;
        printResult(result);
    }

    private static void printResult(double result) {
        System.out.printf("%.2f", result);
    }
}
