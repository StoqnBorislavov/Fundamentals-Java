package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double priceForHeadset = Double.parseDouble(sc.nextLine());
        double priceForMouse = Double.parseDouble(sc.nextLine());
        double priceForKeyboard = Double.parseDouble(sc.nextLine());
        double priceForDisplay = Double.parseDouble(sc.nextLine());
        int countHeadset = lostGames / 2;
        double sumHeadsets = priceForHeadset * countHeadset;
        int countMouse = lostGames / 3;
        double sumMouses = priceForMouse * countMouse;
        int countKeyboard = lostGames / 6;
        double sumKeyboards = priceForKeyboard * countKeyboard;
        int countDisplay = lostGames / 12;
        double sumDisplays = priceForDisplay * countDisplay;

        double expenses = sumHeadsets + sumDisplays + sumKeyboards + sumMouses;
        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
