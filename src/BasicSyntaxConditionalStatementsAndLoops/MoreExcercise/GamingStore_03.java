package BasicSyntaxConditionalStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currentBalance = Double.parseDouble(sc.nextLine());
        double balance = currentBalance;
        String command = sc.nextLine();
        boolean isOutOfMoney = false;

        while(!command.equals("Game Time")) {
            switch (command) {
//                OutFall 4	$39.99
//                CS: OG	$15.99
//                Zplinter Zell	$19.99
//                Honored 2	$59.99
//                RoverWatch	$29.99
//                RoverWatch Origins Edition	$39.99
                case "OutFall 4":
                    if(currentBalance > 39.99){
                        System.out.println("Bought " + "OutFall 4");
                        currentBalance -= 39.99;
                    } else if(currentBalance == 39.99){
                        System.out.println("Bought " + "OutFall 4");
                        System.out.println("Out of money!");
                        currentBalance -= 39.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 39.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if(currentBalance > 15.99){
                        System.out.println("Bought " + "CS: OG");
                        currentBalance -= 15.99;
                    } else if(currentBalance == 15.99){
                        System.out.println("Bought " + "CS: OG");
                        System.out.println("Out of money!");
                        currentBalance -= 15.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 15.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if(currentBalance > 19.99){
                        System.out.println("Bought " + "Zplinter Zell");
                        currentBalance -= 19.99;
                    } else if(currentBalance == 19.99){
                        System.out.println("Bought " + "Zplinter Zell");
                        System.out.println("Out of money!");
                        currentBalance -= 19.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 19.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if(currentBalance > 59.99){
                        System.out.println("Bought " + "Honored 2");
                        currentBalance -= 59.99;
                    } else if(currentBalance == 59.99){
                        System.out.println("Bought " + "Honored 2");
                        System.out.println("Out of money!");
                        currentBalance -= 59.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 59.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if(currentBalance > 29.99){
                        System.out.println("Bought " + "RoverWatch");
                        currentBalance -= 29.99;
                    } else if(currentBalance == 29.99){
                        System.out.println("Bought " + "RoverWatch");
                        System.out.println("Out of money!");
                        currentBalance -= 29.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 29.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if(currentBalance > 39.99){
                        System.out.println("Bought " + "RoverWatch Origins Edition");
                        currentBalance -= 39.99;
                    } else if(currentBalance == 39.99){
                        System.out.println("Bought " + "RoverWatch Origins Edition");
                        System.out.println("Out of money!");
                        currentBalance -= 39.99;
                        isOutOfMoney = true;
                    } else if (currentBalance < 39.99){
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if(isOutOfMoney){
                break;
            }
            command = sc.nextLine();
        }
        if(currentBalance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", balance-currentBalance, currentBalance);
        }
    }
}
