package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> parkingLots = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commandArray = sc.nextLine().split(" ");
            String username = commandArray[1];
            if (commandArray.length == 3) {
                String licensePlate = commandArray[2];
                if (!parkingLots.containsKey(username)) {
                    parkingLots.put(username, licensePlate);
                    System.out.println(username + " registered " + licensePlate + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + licensePlate);
                }
            } else {
                if (!parkingLots.containsKey(username)) {
                    System.out.println("ERROR: user " + username + " not found");
                } else {
                    System.out.println(username + " unregistered successfully");
                    parkingLots.remove(username);
                }

            }

        }
        parkingLots.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
    }
}
