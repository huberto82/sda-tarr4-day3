package list;

public class Car {
    private String model;
    private double power;
    public Car(String model, double power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
