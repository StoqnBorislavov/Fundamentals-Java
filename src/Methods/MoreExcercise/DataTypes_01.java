package Methods.MoreExcercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type){
            case "int":
                int number = Integer.parseInt(sc.nextLine());
                printResult(number);
                break;
            case "real":
                double line = Double.parseDouble(sc.nextLine());
                printResult(line);
                break;
            case "string":
                String text = sc.nextLine();
                printResult(text);
                break;
        }
    }

    private static void printResult(String text) {
        System.out.print("$");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
        }
        System.out.println("$");
    }

    private static void printResult(double number) {
        System.out.printf("%.2f", number * 1.5);
    }

    private static void printResult(int number) {
        System.out.println(number * 2);
    }
}
