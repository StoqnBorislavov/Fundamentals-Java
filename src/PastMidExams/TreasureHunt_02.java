package PastMidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> chest = Arrays.stream(sc.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("Yohoho!")){
            String[] commandsArray = command.split("\\s+");
            String currentCommand = commandsArray[0];
            switch (currentCommand){
                case "Loot":
                    for (int i = 1; i < commandsArray.length; i++) {
                        if(!chest.contains(commandsArray[i])){
                            chest.add(0, commandsArray[i]);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandsArray[1]);
                    if(dropIndex >= 0 && dropIndex < chest.size()){
                        String itemToDrop = chest.remove(dropIndex);
                        chest.add(itemToDrop);
                    }
                    break;
                case "Steal":
                    int stealAmount = Integer.parseInt(commandsArray[1]);
                    List<String>  stolenItems = new ArrayList<>();
                    String outPut = "";
                    if(stealAmount >= chest.size()){
                       outPut = String.join(", ", chest);
                        System.out.println(outPut);
                        chest.clear();
                    } else {
                        for (int i = 0; i < stealAmount; i++) {
                            int lastIndex = chest.size() - 1;
                            stolenItems.add(0, chest.remove(lastIndex));
                        }
                        outPut = String.join(", ", stolenItems);
                        System.out.println(outPut);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        int totalSizeOfLoot = 0;
        for (String item : chest) {
            totalSizeOfLoot += item.length();
        }
        if(totalSizeOfLoot == 0){
            System.out.println("Failed treasure hunt.");
        } else {
            double averagePrice = 1.0 * totalSizeOfLoot / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averagePrice);
        }

    }
}
