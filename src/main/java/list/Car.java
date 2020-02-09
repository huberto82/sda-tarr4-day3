package list;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

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
