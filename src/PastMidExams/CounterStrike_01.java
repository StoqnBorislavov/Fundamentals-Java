package PastMidExams;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int energy = Integer.parseInt(sc.nextLine());
        int initialEnergy = energy;
        String distance = sc.nextLine();
        int countOfWins = 0;
        if (initialEnergy > 0) {
            while (!distance.equals("End of battle") && energy >= 0) {
                int length = Integer.parseInt(distance);

                if (energy - length >= 0) {
                    energy -= length;
                    countOfWins++;
                    if (countOfWins % 3 == 0) {
                        energy += countOfWins;
                    }
                } else {
                    System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countOfWins, energy);
                    return;
                }
                distance = sc.nextLine();
            }
            System.out.printf("Won battles: %d. Energy left: %d%n", countOfWins, energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countOfWins, energy);
        }
    }
}
