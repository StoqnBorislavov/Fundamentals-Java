package RegularExpressions.Exercise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";

        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        List<String> furnitures = new ArrayList<>();
        double totalMoneySpent = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitures.add(furniture);
                totalMoneySpent += price * quantity;

            }
            input = sc.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitures.forEach(e -> System.out.println(e));
        System.out.printf("Total money spend: %.2f", totalMoneySpent);
    }
}
