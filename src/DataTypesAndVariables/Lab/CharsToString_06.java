package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char one = sc.nextLine().charAt(0);
        char two = sc.nextLine().charAt(0);
        char three = sc.nextLine().charAt(0);
        StringBuilder newString = new StringBuilder();
        newString.append(one);
        newString.append(two);
        newString.append(three);
        System.out.println(newString.toString());
    }
}
