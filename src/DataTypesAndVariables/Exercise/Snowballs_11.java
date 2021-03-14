package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        You will receive N – an integer, the number of snowballs being made by Tony and Andi.
//                For each snowball you will receive 3 input lines:
//•	On the first line you will get the snowballSnow – an integer.
//•	On the second line you will get the snowballTime – an integer.
//•	On the third line you will get the snowballQuality – an integer.
//        For each snowball you must calculate its snowballValue by the following formula:
//        (snowballSnow / snowballTime) ^ snowballQuality
        int numberOfSnowballs = Integer.parseInt(sc.nextLine());
        double maxSnowballValue = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballQuality = snowballQuality;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);

    }
}
