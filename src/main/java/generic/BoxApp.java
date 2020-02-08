package generic;

public class BoxApp {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("NAPIS");
        Box<Double> doubleBox = new Box<>(10.0);
    }
}
