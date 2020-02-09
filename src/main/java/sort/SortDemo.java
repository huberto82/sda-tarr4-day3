package sort;

import list.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 100));
        cars.add(new Car("FIAT", 75));
        cars.add(new Car("Audi",125));
        cars.add(new Car("Audi",100));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getPower() < o2.getPower()){
                    return -1;
                }
                if(o1.getPower() > o2.getPower()){
                    return 1;
                }
                return 0;
            }
        });

        for (Car car: cars) {
            System.out.println(car);
        }
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.getModel().compareTo(o2.getModel());
            }
        });
        for (Car car: cars) {
            System.out.println(car);
        }
        Collections.sort(cars, getComparator());
        for (Car car: cars) {
            System.out.println(car);
        }
        int index = Collections.binarySearch(cars, new Car("Audi", 100), getComparator());
        System.out.println(index);
    }

    private static Comparator<Car> getComparator() {
        return new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getPower() < o2.getPower()){
                    return -1;
                }
                if(o1.getPower() > o2.getPower()){
                    return 1;
                }
                return o1.getModel().compareTo(o2.getModel());
            }
        };
    }
}
