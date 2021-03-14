package DataTypesAndVariables.MoreExcercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counterForOpening = 0;
        int counterForClosing = 0;
        boolean isBalanced = true;

        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String text = sc.nextLine();
            if (text.equals("(")) {
                counterForOpening++;
            } else if (text.equals(")")) {
                counterForClosing++;
            }
            if (Math.abs(counterForClosing - counterForOpening) > 1) {
                isBalanced = false;
            }
            if (counterForClosing > counterForOpening){
                isBalanced = false;
            }
        }
        if (counterForClosing != counterForOpening) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
