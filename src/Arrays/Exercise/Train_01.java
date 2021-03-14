package Arrays.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]= Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            sum += numbers[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
