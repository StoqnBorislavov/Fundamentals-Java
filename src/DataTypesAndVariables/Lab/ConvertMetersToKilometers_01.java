package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meters = Integer.parseInt(sc.nextLine());
        double kilometers = 1.0 * meters / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
