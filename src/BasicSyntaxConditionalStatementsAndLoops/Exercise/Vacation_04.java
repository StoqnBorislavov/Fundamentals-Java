package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(sc.nextLine());
        String typeOfPeople = sc.nextLine();
        String day = sc.nextLine();
//        Friday	Saturday	Sunday
//        Students	8.45	9.80	10.46
//        Business	10.90	15.60	16
//        Regular	15	20	22.50
        double price = 0;
        double discount = 1;
        if (day.equals("Friday")) {
            switch (typeOfPeople) {
                case "Students":
                    if (countOfPeople >= 30) {
                        discount = 0.85;
                    }
                    price = (countOfPeople * 8.45) * discount;
                    break;
                case "Business":
                    if (countOfPeople >= 100) {
                        countOfPeople -= 10;
                    }
                    price = (countOfPeople * 10.90);
                    break;
                case "Regular":
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        discount = 0.95;
                    }
                    price = (countOfPeople * 15) * discount;
                    break;
            }

        } else if (day.equals("Saturday")) {
            switch (typeOfPeople) {
                case "Students":
                    if (countOfPeople >= 30) {
                        discount = 0.85;
                    }
                    price = (countOfPeople * 9.80) * discount;
                    break;
                case "Business":
                    if (countOfPeople >= 100) {
                        countOfPeople -= 10;
                    }
                    price = (countOfPeople * 15.60);
                    break;
                case "Regular":
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        discount = 0.95;
                    }
                    price = (countOfPeople * 20) * discount;
                    break;
            }


        } else if (day.equals("Sunday")) {
            switch (typeOfPeople) {
                case "Students":
                    if (countOfPeople >= 30) {
                        discount = 0.85;
                    }
                    price = (countOfPeople * 10.46) * discount;
                    break;
                case "Business":
                    if (countOfPeople >= 100) {
                        countOfPeople -= 10;
                    }
                    price = (countOfPeople * 16);
                    break;
                case "Regular":
                    if (countOfPeople >= 10 && countOfPeople <= 20) {
                        discount = 0.95;
                    }
                    price = (countOfPeople * 22.50) * discount;
                    break;
            }

        }
        System.out.printf("Total price: %.2f", price);

    }
}
