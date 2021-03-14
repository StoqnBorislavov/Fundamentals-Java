package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(sc.nextLine()
                .split(">"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(sc.nextLine()
                .split(">"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();
        while (!command.equals("Retire")) {
            String[] commandArguments = command.split(" ");
            String commandName = commandArguments[0];
            switch (commandName) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandArguments[1]);
                    int damage = Integer.parseInt(commandArguments[2]);
                    if (fireIndex < 0 || fireIndex >= warShip.size()) {
                        break;
                    }
                    int sectionHealth = warShip.get(fireIndex);
                    sectionHealth -= damage;
                    if (sectionHealth <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShip.set(fireIndex, sectionHealth);
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArguments[1]);
                    int endIndex = Integer.parseInt(commandArguments[2]);
                    int damageDealt = Integer.parseInt(commandArguments[3]);
                    if (startIndex < 0 || startIndex >= pirateShip.size()) {
                        break;
                    }
                    if (endIndex < 0 || endIndex >= pirateShip.size()) {
                        break;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentSection = pirateShip.get(i);
                        currentSection -= damageDealt;
                        if (currentSection <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShip.set(i, currentSection);
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandArguments[1]);
                    int repairHealth = Integer.parseInt(commandArguments[2]);
                    if (repairIndex < 0 || repairIndex >= pirateShip.size()) {
                        break;
                    }
                    int sectionToRepair = pirateShip.get(repairIndex);
                    sectionToRepair += repairHealth;
                    if (sectionToRepair > maxHealth) {
                        sectionToRepair = maxHealth;
                    }
                    pirateShip.set(repairIndex, sectionToRepair);
                    break;
                case "Status":
                    int count = 0;
                    for (Integer section : pirateShip) {
                        if (section < 0.2 * maxHealth) {
                            count++;
                        }
                    }
                    System.out.println(count + " sections need repair.");
                    break;
            }
            command = sc.nextLine();
        }
        int pirateShipStatus = 0;
        for (Integer currentStatus : pirateShip) {
            pirateShipStatus += currentStatus;
        }
        System.out.printf("Pirate ship status: %d%n", pirateShipStatus);
        int warShipStatus = 0;
        for (Integer currentStatus : warShip) {
            warShipStatus += currentStatus;
        }
        System.out.printf("Warship status: %d%n", warShipStatus);
    }
}
