package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarListDemo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(100);
        cars.add(new Car("Audi",150));
        cars.add(new Car("BMW",200));
        cars.add(new Car("BMW", 134));
        cars.add(new Car("Fiat", 75));
        cars.set(3, new Car("Opel",100));
        System.out.println("Przeglądanie pętlą for:");
        for(int i = 0; i < cars.size(); i ++){
            System.out.println(cars.get(i));
        }
        System.out.println("Przeglądanie pętlą for each:");
        for(Car car: cars){
            System.out.println(car);
        }
        System.out.println("Przeglądanie iteratorem:");
        Iterator<Car> carIterator = cars.iterator();
        while(carIterator.hasNext()){
            Car car = carIterator.next();
            System.out.println(car);
        }
        System.out.println("Usuwamy BMW pętlą for:");
        removeBMW(cars);
        System.out.println(cars);

        System.out.println("Usuwamy BMW iteratorem:");
        removeBMWIterator(cars);
        System.out.println(cars);


    }
    public static void removeBMW(List<Car> list){
        for(int i = 0; i < list.size(); i++){
            Car car = list.get(i);
            if (car.getModel().equals("BMW")){
                list.remove(i);
            }
        }
    }

    public static void removeBMWIterator(List<Car> list){
        Iterator<Car> iterator = list.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            if(car.getModel().equals("BMW")){
                iterator.remove();
            }
        }
    }
}
