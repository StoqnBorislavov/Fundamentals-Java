package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String firstElement = input[0];
            String secondElement = input[1];
            if ((i + 1) % 2 == 0) {
                arr2[i] = firstElement;
                arr1[i] = secondElement;
            } else {
                arr1[i] = firstElement;
                arr2[i] = secondElement;
            }
        }
        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}
