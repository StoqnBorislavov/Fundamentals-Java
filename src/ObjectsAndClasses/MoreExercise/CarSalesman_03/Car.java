package ObjectsAndClasses.MoreExercise.CarSalesman_03;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;


    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n\t%s:%n\t\tPower: %d%n\t\tDisplacement: %s%n\t\tEfficiency: %s%n\tWeight: %s%n\tColor: %s",
                model, engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(),
                weight, color);
    }
}
