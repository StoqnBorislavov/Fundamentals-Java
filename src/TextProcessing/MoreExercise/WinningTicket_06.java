package TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WinningTicket_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tickets = Arrays.stream(sc.nextLine().split(",\\s+"))
                .collect(Collectors.toList());
        for (String ticket : tickets) {
            ticket = ticket.trim();
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }
            int countLeft = 0;
            int maxCountLeft = 0;
            String specialCharLeft = "";
            String reallySpecialCharLeft = "";
            String specialCharRight = "";
            String reallySpecialCharRight = "";
            String leftSideTicket = ticket.substring(0, ticket.length() / 2);
            String rightSideTicket = ticket.substring(ticket.length() / 2);
            for (int i = 0; i < leftSideTicket.length() - 1; i++) {
                char currentChar = leftSideTicket.charAt(i);
//                '@', '#', '$' and '^
                if (currentChar == '@' || currentChar == '#'
                        || currentChar == '$' || currentChar == '^' && currentChar == leftSideTicket.charAt(i + 1)) {
                    if (i + 1 == leftSideTicket.length() - 1 && ((leftSideTicket.charAt(i + 1) + "").equals(reallySpecialCharLeft))) {
                        countLeft += 2;
                        if (countLeft > maxCountLeft) {
                            maxCountLeft = countLeft;
                            reallySpecialCharLeft = specialCharLeft;
                        }
                        break;
                    }
                    countLeft++;
                    specialCharLeft = currentChar + "";
                } else {
                    countLeft = 0;
                }
                if (countLeft > maxCountLeft) {
                    maxCountLeft = countLeft;
                    reallySpecialCharLeft = specialCharLeft;
                }

            }
            int countRight = 0;
            int maxCountRight = 0;
            for (int i = 0; i < rightSideTicket.length() - 1; i++) {
                char currentChar = rightSideTicket.charAt(i);
//                '@', '#', '$' and '^
                if (currentChar == '@' || currentChar == '#'
                        || currentChar == '$' || currentChar == '^' && currentChar == leftSideTicket.charAt(i + 1)) {
                    if (i + 1 == rightSideTicket.length() - 1 && ((rightSideTicket.charAt(i + 1) + "").equals(reallySpecialCharRight))) {
                        countRight += 2;
                        if (countRight > maxCountRight) {
                            maxCountRight = countRight;
                            reallySpecialCharRight = specialCharRight;
                        }
                        break;
                    }
                    countRight++;
                    specialCharRight = currentChar + "";
                } else {
                    countRight = 0;
                }
                if (countRight > maxCountRight) {
                    maxCountRight = countRight;
                    reallySpecialCharRight = specialCharRight;
                }
            }
            ticket = "\"" + ticket + "\"";
            if (maxCountRight == 10 && maxCountLeft == 10 && reallySpecialCharLeft.equals(reallySpecialCharRight)) {

                System.out.printf("ticket %s - %d%s Jackpot!%n", ticket, Math.min(maxCountLeft, maxCountRight), reallySpecialCharLeft);
            } else if (maxCountRight >= 6 && maxCountRight <= 10 && maxCountLeft >= 6 && maxCountLeft <= 10 && reallySpecialCharLeft.equals(reallySpecialCharRight)) {

                System.out.printf("ticket %s - %d%s%n", ticket, Math.min(maxCountLeft, maxCountRight), reallySpecialCharLeft);
            } else {
                System.out.printf("ticket %s - no match%n", ticket);
            }


        }

    }
}
