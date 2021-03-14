package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PrintPartOfTheASCIITable_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startCode = Integer.parseInt(sc.nextLine());
        int endCode = Integer.parseInt(sc.nextLine());

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char)code + " ");
        }
    }
}
