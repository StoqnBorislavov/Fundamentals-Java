package RegularExpressions.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tickets = Arrays.stream(sc.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList());
        for (int i = 0; i < tickets.size(); i++) {
            String currentTicket = tickets.get(i);
            if (currentTicket.length() == 20) {
                String leftHalfOfTicket = currentTicket.substring(0, currentTicket.length() / 2);
                String rightHalfOfTicket = currentTicket.substring(currentTicket.length() / 2);
                String regex = "\\@{6,10}|\\${6,10}|\\^{6,10}|\\#{6,10}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcherLeft = pattern.matcher(leftHalfOfTicket);
                Matcher matcherRight = pattern.matcher(rightHalfOfTicket);
                String machSymbolsLeft = "";
                String machSymbolsRight = "";
                if (matcherLeft.find() && matcherRight.find()) {
                    machSymbolsLeft += matcherLeft.group();
                    machSymbolsRight += matcherRight.group();
                    String matchedSymbols = "";
                    if(machSymbolsLeft.charAt(0) == machSymbolsRight.charAt(0)) {
                        if (machSymbolsLeft.length() <= machSymbolsRight.length()) {
                            matchedSymbols = machSymbolsLeft;
                        } else {
                            matchedSymbols = machSymbolsRight;
                        }
                        if (matchedSymbols.length() < 10) {
                            System.out.printf("ticket \"%s\" - %s%c%n", currentTicket, matchedSymbols.length(), matchedSymbols.charAt(0));
                        } else if (matchedSymbols.length() == 10) {
                            System.out.printf("ticket \"%s\" - %s%c Jackpot!%n", currentTicket, matchedSymbols.length(), matchedSymbols.charAt(0));
                        }
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", currentTicket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}