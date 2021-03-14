package TextProcessing.MoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            int startNameIndex = input.indexOf("@");
            int endNameIndex = input.indexOf("|");
            String name = input.substring(startNameIndex+1, endNameIndex);
            int startAgeIndex = input.indexOf("#");
            int endAgeIndex = input.indexOf("*");
            String age = input.substring(startAgeIndex + 1, endAgeIndex);
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
