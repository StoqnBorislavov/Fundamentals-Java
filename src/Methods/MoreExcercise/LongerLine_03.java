package Methods.MoreExcercise;

import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x11 = Integer.parseInt(sc.nextLine());
        int y11 = Integer.parseInt(sc.nextLine());
        int x12 = Integer.parseInt(sc.nextLine());
        int y12 = Integer.parseInt(sc.nextLine());
        int x21 = Integer.parseInt(sc.nextLine());
        int y21 = Integer.parseInt(sc.nextLine());
        int x22 = Integer.parseInt(sc.nextLine());
        int y22 = Integer.parseInt(sc.nextLine());

        findTheLongestLine(x11, y11, x12, y12, x21, y21, x22, y22);
    }

    private static void findTheLongestLine(int x11, int y11, int x12, int y12, int x21, int y21, int x22, int y22) {
        double firstLineLength = findLineLength(x11, y11, x12, y12);
        double secondLineLength = findLineLength(x21, y21, x22, y22);
        if(firstLineLength >= secondLineLength){
            findTheClosestPoint(x11, y11, x12, y12);
        } else {
            findTheClosestPoint(x21, y21, x22, y22);
        }
    }

    private static double findLineLength(int x11, int y11, int x12, int y12) {
        int firstXSide = 0;
        if (x11 > 0 && x12 > 0 || x11 < 0 && x12 < 0) {
            if (x11 < x12) {
                firstXSide = x12 - x11;
            } else if (x11 > x12) {
                firstXSide = x11 - x12;
            }
        } else if(x11 <= 0 && x12 >= 0 || x11 >= 0 && x12 <= 0){
            firstXSide = Math.abs(x12) + Math.abs(x11);
        }
        int firstYSide = 0;
        if (y11 > 0 && y12 > 0 || y11 < 0 && y12 < 0) {
            if (y11 < y12) {
                firstYSide = y12 - y11;
            } else if (y11 > y12) {
                firstYSide = y11 - y12;
            }
        } else if(y11 <= 0 && y12 >= 0 || y11 >= 0 && y12 <= 0){
            firstYSide = Math.abs(y12) + Math.abs(y11);
        }
        return Math.pow(Math.abs(firstXSide), 2) + Math.pow(Math.abs(firstYSide), 2);

    }

    private static void findTheClosestPoint(int x1, int y1, int x2, int y2) {
        double hypotenuse1 = Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2);
        double hypotenuse2 = Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2);
        if (hypotenuse1 <= hypotenuse2) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }
}
