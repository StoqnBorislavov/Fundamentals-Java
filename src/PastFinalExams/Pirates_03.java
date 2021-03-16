package PastFinalExams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Integer> goldMap = new HashMap<>();
        Map<String, Integer> peopleMap = new HashMap<>();


        while (!input.equals("Sail")) {
            String city = input.split("\\|\\|")[0].trim();
            int population = Integer.parseInt(input.split("\\|\\|")[1].trim());
            int gold = Integer.parseInt(input.split("\\|\\|")[2].trim());
            if (!goldMap.containsKey(city)) {
                goldMap.put(city, gold);
                peopleMap.put(city, population);
            } else {
                goldMap.put(city, goldMap.get(city) + gold);
                peopleMap.put(city, peopleMap.get(city) + population);
            }
            input = sc.nextLine();
        }

        String eventLine = sc.nextLine();

        while (!eventLine.equals("End")) {
            String[] eventCommand = eventLine.split("=>");
            String command = eventCommand[0];
            String town = eventCommand[1];
            switch (command) {
                case "Plunder":
//                    •	"Plunder=>{town}=>{people}=>{gold}"
                    int people = Integer.parseInt(eventCommand[2]);
                    int gold = Integer.parseInt(eventCommand[3]);
                    goldMap.put(town, goldMap.get(town) - gold);
                    peopleMap.put(town, peopleMap.get(town) - people);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            town, gold, people);
                    if (peopleMap.get(town) <= 0 || goldMap.get(town) <= 0) {
                        peopleMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
//                    •	"Prosper=>{town}=>{gold}"
                    int prosperGold = Integer.parseInt(eventCommand[2]);
                    if (prosperGold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        goldMap.put(town, goldMap.get(town) + prosperGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                prosperGold, town, goldMap.get(town));
                    }
                    break;
            }
            eventLine = sc.nextLine();
        }
        if (goldMap.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", goldMap.size());
            goldMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> {
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                                e.getKey(), peopleMap.get(e.getKey()), e.getValue());
                    });
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
