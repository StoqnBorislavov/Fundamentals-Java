package ObjectsAndClasses.MoreExercise.CarSalesman_03;

public class Engine {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;


    public Engine(String model, int power, String  displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String getModel() {
        return model;
    }

}
