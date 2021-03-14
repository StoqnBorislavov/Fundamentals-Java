package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char one = sc.nextLine().charAt(0);
        char two = sc.nextLine().charAt(0);
        char three = sc.nextLine().charAt(0);
        System.out.printf("%c %c %c", three, two, one);

    }
}
