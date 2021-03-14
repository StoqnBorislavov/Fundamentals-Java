package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int currentDay = Integer.parseInt(sc.nextLine());
        if (currentDay >= 1 && currentDay <= 7) {
            System.out.println(dayOfWeek[currentDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
