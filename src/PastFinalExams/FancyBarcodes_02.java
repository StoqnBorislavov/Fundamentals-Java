package PastFinalExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "@[#]+[A-Z][a-zA-Z0-9]{4,}([A-Z]+)@[#]+";
        String regexForDigits = "[\\d]";
        Pattern patternForDigits = Pattern.compile(regexForDigits);
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);
            String barcode = "";
            if (matcher.find()) {
                Matcher matcher1 = patternForDigits.matcher(input);
                while (matcher1.find()) {
                    barcode += matcher1.group();
                }
            } else {
                System.out.println("Invalid barcode");
                continue;
            }
            if (barcode.isEmpty()) {
                barcode = "00";
            }
            System.out.printf("Product group: %s%n", barcode);
        }
    }
}
