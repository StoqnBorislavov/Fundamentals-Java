package ObjectsAndClasses.MoreExercise.RawData_02;

import java.security.PrivateKey;
import java.util.List;

public class Car {
//    “<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure> <Tire1Age>
//    <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>”
//    where the speed, power, weight and tire age are integers, tire pressure is a double
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tires> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Tires> getTires() {
        return tires;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
