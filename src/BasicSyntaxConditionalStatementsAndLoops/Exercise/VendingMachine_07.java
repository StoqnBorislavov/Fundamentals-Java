package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        You task is to calculate the total price of a purchase from a vending machine.
//                Until you receive "Start" you will be given different coins that are being
//        inserted in the machine. You have to sum them in order to have the total money inserted.
//                There is a problem though. Your vending machine only works with
//        0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins you
//        have to display "Cannot accept {money}", where the value is formated to the second digit
//        after the decimal point and not add it to the total money. On the next few lines until you
//    receive "End" you will be given products to purchase. Your machine has however only
//    "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
//                If the person tries to purchase a not existing product print “Invalid product”.
//        Be careful that the person may try to purchase a product for which he doesn't have money.
//        In that case print "Sorry, not enough money". If the person purchases a product successfully
//        print "Purchased {product name}". After the “End” command print the money that are left
//        formatted to the second decimal point in the format "Change: {money left}".

        String command = sc.nextLine();
        double money = 0;
        while(!command.equals("Start")){
            double coin = Double.parseDouble(command);
            if (coin == 0.1) {
                money += coin;
            } else if (coin == 0.2){
                money += coin;
            }else if(coin == 0.5){
                money += coin;
            } else if (coin == 1){
                money += coin;
            }else if (coin == 2){
                money += coin;
            }else{
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            command = sc.nextLine();
        }
        String product = sc.nextLine();
        while (!product.equals("End")){
// "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
            if(product.equals("Nuts")){
                if(money >= 2){
                    money -= 2;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")){
                if(money >= 0.7){
                    money -= 0.7;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Crisps")) {
                if (money >= 1.5) {
                    money -= 1.5;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {
                if (money >= 0.8) {
                    money -= 0.8;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {
                if (money >= 1) {
                    money -= 1;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else{
                System.out.println("Invalid product");
            }
            product = sc.nextLine();
        }
        System.out.printf("Change: %.2f", money);

    }
}
