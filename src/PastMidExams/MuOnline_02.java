package PastMidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> splitedInput = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        List<String[]> finalList = new ArrayList<>();
        for (int i = 0; i < splitedInput.size(); i++) {
            String[] room = splitedInput.get(i).split("\\s+");
            finalList.add(room);
        }
        int initialHealth = 100;
        int collectedBitcoin = 0;
        for (int i = 0; i < finalList.size(); i++) {
            String command = finalList.get(i)[0];
            switch (command) {
                case "potion":
                    int healedHp = Integer.parseInt(finalList.get(i)[1]);
                    if (initialHealth + healedHp > 100) {
                        healedHp = 100 - initialHealth;
                        initialHealth = 100;
                    } else {
                        initialHealth += healedHp;
                    }
                    System.out.printf("You healed for %d hp.%n", healedHp);
                    System.out.printf("Current health: %d hp.%n", initialHealth);

                    break;
                case "chest":
                    int bitcoin = Integer.parseInt(finalList.get(i)[1]);
                    System.out.printf("You found %d bitcoins.%n", bitcoin);
                    collectedBitcoin += bitcoin;

                    break;
                default:
                    int attackHp = Integer.parseInt(finalList.get(i)[1]);
                    if (initialHealth - attackHp > 0) {
                        initialHealth -= attackHp;
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    }
                    break;
            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", collectedBitcoin, initialHealth);
    }
}
