package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        List<Integer> lift = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int newItem = 0;
        boolean isFull= true;
        while (people > 0) {
            for (int i = 0; i < lift.size(); i++) {
                if(lift.get(i) < 4){
                    if(people >= 4 - lift.get(i)){
                        people -= 4 - lift.get(i);
                        lift.set(i, 4);
                    } else {
                        lift.set(i, lift.get(i) + people);
                        people = 0;
                    }
                }
            }
            for (Integer wagon : lift) {
                if(wagon != 4){
                    isFull = false;
                }
            }
            if(isFull && people >0){
                System.out.printf("There isn't enough space! %d people in a queue!%n", people);
                for (Integer wagon : lift) {
                    System.out.print(wagon + " ");
                }
                return;

            }
        }
        if(!isFull){
            System.out.printf("The lift has empty spots!%n");
            for (Integer wagon : lift) {
                System.out.print(wagon + " ");
            }
        } else {
            for (Integer wagon : lift) {
                System.out.print(wagon + " ");
            }
        }
    }
}


