package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        switch (country){
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
