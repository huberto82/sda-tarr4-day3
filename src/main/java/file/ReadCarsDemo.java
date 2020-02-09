package file;

import list.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadCarsDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("c:\\temp\\cars.ser");
        ObjectInputStream input = new ObjectInputStream(inputStream);
        Car car;
        List<Car> cars = new ArrayList<>();

        try {
            while (true) {
                car = (Car) input.readObject();
                cars.add(car);
            }
        } catch (IOException e) {
        } finally {
            for (Car c : cars) {
                System.out.println(c);
            }
            input.close();
        }
    }
}
