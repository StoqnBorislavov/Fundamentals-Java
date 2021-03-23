package PastFinalExams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> myCarsDistance = new HashMap<>();
        Map<String, Integer> myCarsFuel = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] carData = sc.nextLine().split("\\|");
            String carName = carData[0];
            int carMillage = Integer.parseInt(carData[1]);
            int fuel = Integer.parseInt(carData[2]);
            myCarsDistance.put(carName, carMillage);
            myCarsFuel.put(carName, fuel);

        }
        String input = sc.nextLine();

        while (!input.equals("Stop")) {
            String[] comm = input.split("\\s+:\\s+");
            String command = comm[0];
            String car = comm[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(comm[2]);
                    int fuel = Integer.parseInt(comm[3]);
                    if (myCarsFuel.get(car) > fuel) {
                        myCarsFuel.put(car, myCarsFuel.get(car) - fuel);
                        myCarsDistance.put(car, myCarsDistance.get(car) + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                        if (myCarsDistance.get(car) >= 100000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            myCarsDistance.remove(car);
                            myCarsFuel.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    break;
                case "Refuel":
                    int fuelForRefuel = Integer.parseInt(comm[2]);
                    if (myCarsFuel.get(car) + fuelForRefuel <= 75) {
                        myCarsFuel.put(car, myCarsFuel.get(car) + fuelForRefuel);
                        System.out.printf("%s refueled with %d liters%n", car, fuelForRefuel);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", car, 75 - myCarsFuel.get(car));
                        myCarsFuel.put(car, 75);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(comm[2]);
                    if (myCarsDistance.get(car) - kilometers < 10000) {
                        myCarsDistance.put(car, 10000);
                    } else {
                        myCarsDistance.put(car, myCarsDistance.get(car) - kilometers);
                        System.out.printf("%s mileage decreased by %s kilometers%n", car, kilometers);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        myCarsDistance.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                            e.getKey(), e.getValue(), myCarsFuel.get(e.getKey()));
                });
    }
}
