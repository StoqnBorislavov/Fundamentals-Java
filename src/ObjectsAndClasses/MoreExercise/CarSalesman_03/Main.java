package ObjectsAndClasses.MoreExercise.CarSalesman_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Engine> engines = new ArrayList<>();
         for (int i = 0; i < n; i++) {
            String[] inputForEngine = sc.nextLine().split("\\s+");
            String engineModel = inputForEngine[0];
            int power = Integer.parseInt(inputForEngine[1]);
            if(inputForEngine.length == 2){
                String displacement = "n/a";
                String efficiency = "n/a";
                Engine engine = new Engine(engineModel, power, displacement, efficiency);
                engines.add(engine);
            } else if (inputForEngine.length == 4){
                String displacement = inputForEngine[2];
                String efficiency = inputForEngine[3];
                Engine engine = new Engine(engineModel, power, displacement, efficiency);
                engines.add(engine);
            } else {
                boolean isDisplacement = true;
                for (int j = 0; j < inputForEngine[2].length(); j++) {
                    char c = inputForEngine[2].charAt(i);
                    if(c <= '0' || c >= '9'){
                        isDisplacement = false;
                    }
                }
                if(isDisplacement){
                    String displacement = inputForEngine[2];
                    String efficiency = "n/a";
                    Engine engine = new Engine(engineModel, power, displacement, efficiency);
                    engines.add(engine);
                } else {
                    String efficiency = inputForEngine[2];
                    String displacement = "n/a";
                    Engine engine = new Engine(engineModel, power, displacement, efficiency);
                    engines.add(engine);
                }
            }
        }
         int m = Integer.parseInt(sc.nextLine());
         List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {

            String[] inputForCar = sc.nextLine().split("\\s+");
            String model = inputForCar[0];
            String modelEngine = inputForCar[1];
            Engine engine = null;
            for (int j = 0; j < engines.size(); j++) {
                if(modelEngine.equals(engines.get(j).getModel())){
                    engine = engines.get(j);
                }
            }
            if(inputForCar.length == 2){
                String color = "n/a";
                String weight = "n/a";
                Car car = new Car(model, engine, weight, color);
                cars.add(car);
            } else if(inputForCar.length ==4){
                String weight  = inputForCar[2];
                String color = inputForCar[3];
                Car car = new Car(model, engine, weight, color);
                cars.add(car);
            } else {
                    boolean isWeight = true;
                    for (int j = 0; j < inputForCar[2].length(); j++) {
                        char c = inputForCar[2].charAt(i);
                        if(c <= '0' || c >= '9'){
                            isWeight = false;
                        }
                    }
                    if(isWeight){
                        String weight = inputForCar[2];
                        String color = "n/a";
                        Car car = new Car(model, engine, weight, color);
                        cars.add(car);
                    } else {
                        String color = inputForCar[2];
                        String weight = "n/a";
                        Car car = new Car(model, engine, weight, color);
                        cars.add(car);
                    }

            }


        }
        for (Car car : cars) {
            System.out.println(car);

        }
    }
}
