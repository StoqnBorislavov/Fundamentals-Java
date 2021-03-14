package ObjectsAndClasses.Exercise.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();
        int sumOfCarsHorsePower = 0;
        int sumOfTrucksHorsePower = 0;
        while (!input[0].equals("End")) {
            String typeOfVehicle = input[0];
            String model = input[1];
            String color = input[2];
            int horsepower = Integer.parseInt(input[3]);

            if (typeOfVehicle.equals("car")) {
                String typeWithFirstUpperCase = "Car";
                Vehicle vehicle = new Vehicle(typeWithFirstUpperCase, model, color, horsepower);
                cars.add(vehicle);
                sumOfCarsHorsePower += vehicle.getHorsepower();
            } else if(typeOfVehicle.equals("truck")){
                String typeWithFirstUpperCase = "Truck";
                Vehicle vehicle = new Vehicle(typeWithFirstUpperCase, model, color, horsepower);
                trucks.add(vehicle);
                sumOfTrucksHorsePower += vehicle.getHorsepower();
            }
            input = sc.nextLine().split("\\s+");
        }
        String model = sc.nextLine();

        while (!model.equals("Close the Catalogue")) {
            for (int i = 0; i < cars.size(); i++) {
                if (model.equals(cars.get(i).getModel())) {
                    System.out.println(cars.get(i));
                }
            }
            for (int i = 0; i < trucks.size(); i++) {
                if (model.equals(trucks.get(i).getModel())) {
                    System.out.println(trucks.get(i));
                }
            }
            model = sc.nextLine();
        }
        double averageTrucksHorsePower =0;
        if(trucks.size() > 0) {
            averageTrucksHorsePower = sumOfTrucksHorsePower * 1.0 / trucks.size();
        }
        double averageCarsHorsePower = 0;
        if(cars.size() > 0){
            averageCarsHorsePower = sumOfCarsHorsePower * 1.0 / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHorsePower);

    }
}
