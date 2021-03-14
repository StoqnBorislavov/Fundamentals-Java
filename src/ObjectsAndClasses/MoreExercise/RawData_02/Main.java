package ObjectsAndClasses.MoreExercise.RawData_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            double tyre1Pressure = Double.parseDouble(input[5]);
            int type1Age = Integer.parseInt(input[6]);
            double tyre2Pressure = Double.parseDouble(input[7]);
            int type2Age = Integer.parseInt(input[8]);
            double tyre3Pressure = Double.parseDouble(input[9]);
            int type3Age = Integer.parseInt(input[10]);
            double tyre4Pressure = Double.parseDouble(input[11]);
            int type4Age = Integer.parseInt(input[12]);
            Tires tire1 = new Tires(tyre1Pressure, type1Age);
            Tires tire2 = new Tires(tyre2Pressure, type2Age);
            Tires tire3 = new Tires(tyre3Pressure, type3Age);
            Tires tire4 = new Tires(tyre4Pressure, type4Age);
            List<Tires> allTires = new ArrayList<>();
            allTires.add(tire1);
            allTires.add(tire2);
            allTires.add(tire3);
            allTires.add(tire4);
            Car car = new Car(model, engine, cargo, allTires);
            cars.add(car);
        }
        String command = sc.nextLine();
        if (command.equals("fragile")) {
            for (int i = 0; i < cars.size(); i++) {
                if (command.equals(cars.get(i).getCargo().getCargoType())) {
                    for (int j = 0; j < cars.get(i).getTires().size(); j++) {
                        if (cars.get(i).getTires().get(j).getTyrePressure() < 1) {
                            System.out.println(cars.get(i).getModel());
                            break;

                        }
                    }
                }
            }
        } else if (command.equals("flamable")) {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getEngine().getEnginePower() > 250) {
                    System.out.println(cars.get(i).getModel());
                }
            }

        }
    }
}

