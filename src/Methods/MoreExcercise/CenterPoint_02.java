package Methods.MoreExcercise;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        findTheClosestPoint(x1, y1, x2, y2);
    }

    private static void findTheClosestPoint(int x1, int y1, int x2, int y2) {
        double hypotenuse1 = Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2);
        double hypotenuse2 = Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2);
        if (hypotenuse1 <= hypotenuse2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
