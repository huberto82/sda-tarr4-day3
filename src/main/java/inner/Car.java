package inner;

public class Car {
    private Engine engine;
    public Wheel wheel;

    public Car(double power) {
        engine = new Engine(power);
        wheel = new Wheel(4.5);
    }

    public double getPower(){
        return engine.power;
    }

    private class Engine{
        private double power;

        public Engine(double power) {
            this.power = power;
        }
    }

    public class Wheel{
        private double diameter;

        public Wheel(double diameter) {
            this.diameter = diameter;
        }

        public double getDiameter() {
            return diameter;
        }
    }

}
