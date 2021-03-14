package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        if(minutes >= 30) {
            minutes = (minutes + 30) - 60;
            if(hours == 23){
                hours = 0;
            }else {
                hours++;
            }
        }else{
            minutes = minutes + 30;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
