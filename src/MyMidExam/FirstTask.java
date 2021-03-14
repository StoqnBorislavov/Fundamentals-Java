package MyMidExam;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double flourPrice = Double.parseDouble(sc.nextLine());
        double eggPrice = Double.parseDouble(sc.nextLine());
        double apronPrice = Double.parseDouble(sc.nextLine());

        int freePackagesFlour = students / 5;

        double priceForNeededItems = (apronPrice * Math.ceil(1.2 * students)) + (eggPrice * 10 * students)
                + (flourPrice * (students - freePackagesFlour));
        if (priceForNeededItems <= budget) {
            System.out.printf("Items purchased for %.2f$.", priceForNeededItems);
        } else {
            double neededMoney = priceForNeededItems - budget;
            System.out.printf("%.2f$ more needed.", neededMoney);
        }
    }
}
