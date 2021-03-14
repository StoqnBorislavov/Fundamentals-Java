package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                int wagonsToAdd = Integer.parseInt(tokens[1]);
                wagons.add(wagonsToAdd);
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int passengersToAdd = Integer.parseInt(tokens[0]);
                    int passengersInWagon = wagons.get(i);
                    if (passengersInWagon + passengersToAdd <= maxCapacity) {
                        wagons.set(i, passengersInWagon + passengersToAdd);
                        break;
                    }
                }
            }

            input = sc.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");

        }
    }
}
