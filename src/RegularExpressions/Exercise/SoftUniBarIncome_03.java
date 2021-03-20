package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "%(?<customer>[A-Z][a-z]+)%[^|%$.]*<(?<product>\\w+)>[^|%$.]*\\|(?<quantity>\\d+)\\|[^|%$.]*?(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        String input = sc.nextLine();
        double totalIncome = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            double totalPrice = 0;
            if (matcher.find()) {
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                totalPrice += quantity * price;
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"),
                        matcher.group("product"), totalPrice);
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
