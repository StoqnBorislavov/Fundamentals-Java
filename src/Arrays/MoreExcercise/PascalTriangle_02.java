package Arrays.MoreExcercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pascalTriangleNumber = Integer.parseInt(sc.nextLine());
        int[] firstArray = {1};
        System.out.println("1");
        for (int j = 0; j < pascalTriangleNumber - 1; j++) {
            int[] secondArray = new int[firstArray.length + 1];
            int indexSecondArray = 0;
            for (int i = 0; i < firstArray.length; i++) {
                if (i == 0) {
                    secondArray[indexSecondArray++] = firstArray[i];
                    System.out.print(firstArray[i] + " ");
                }
                if (i != 0) {
                    secondArray[indexSecondArray++] = firstArray[i] + firstArray[i - 1];
                    System.out.print((firstArray[i] + firstArray[i - 1]) + " ");
                }
                if (i == firstArray.length - 1) {
                    secondArray[indexSecondArray++] = firstArray[i];
                    System.out.print(firstArray[i]);
                }
            }
            System.out.println();
            firstArray = secondArray;
        }
    }
}


