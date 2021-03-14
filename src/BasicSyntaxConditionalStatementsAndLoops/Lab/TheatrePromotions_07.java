package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class TheatrePromotions_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int ticketPrice = 0;
//        Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
//        Weekday	12$	18$	12$
//        Weekend	15$	20$	15$
//        Holiday	5$	12$	10$

        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 5;
                    break;
            }

        } else if (age >= 19 && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 18;
                    break;
                case "Weekend":
                    ticketPrice = 20;
                    break;
                case "Holiday":
                    ticketPrice = 12;
                    break;
            }

        } else if (age >= 65 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 10;
                    break;
            }

        } else {
            System.out.println("Error!");
        }
        if (ticketPrice > 0) {
            System.out.printf("%d$", ticketPrice);
        }

    }
}
