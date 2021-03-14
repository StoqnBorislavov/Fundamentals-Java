package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOne = sc.nextLine();
        String nameTwo = sc.nextLine();
        String delimiter = sc.nextLine();
        System.out.printf("%s%s%s", nameOne, delimiter, nameTwo);
    }
}
