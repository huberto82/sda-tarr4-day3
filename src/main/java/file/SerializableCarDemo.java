package file;

import list.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerializableCarDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\temp\\cars.ser");
        ObjectOutputStream output = new ObjectOutputStream(outputStream);
        List<Car> cars = Arrays.asList(
                new Car("BMW",100),
                new Car("FIAt", 125),
                new Car("AUDI", 150)
        );

        for(Car car: cars){
            output.writeObject(car);
        }
        output.close();
    }
}
