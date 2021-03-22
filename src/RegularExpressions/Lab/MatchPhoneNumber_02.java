package RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        String phones = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phones);
        

        List<String> matcherPhones = new ArrayList<>();
        while(matcher.find()){
            matcherPhones.add((matcher.group()));
        }
        System.out.println(matcherPhones.toString().replaceAll("[\\[\\]]", ""));

    }
}
