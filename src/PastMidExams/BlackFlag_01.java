package PastMidExams;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int dailyPlunder = Integer.parseInt(sc.nextLine());
        double expectedPlunder = Double.parseDouble(sc.nextLine());
        double realPlunder = 0;
        for (int i = 1; i <= days; i++) {
            double plunder = 0;
            realPlunder += dailyPlunder;
            if (i % 3 == 0) {
                plunder = dailyPlunder * 0.5;
            }
            realPlunder += plunder;
            if (i % 5 == 0) {
                realPlunder -= 0.3 * realPlunder;
            }
        }

        if (realPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", realPlunder);
        } else {
            double percentOfExpectedPlunder = realPlunder * 100 / expectedPlunder;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfExpectedPlunder);
        }
    }
}
