package inner;


public class CarApp {
    public static void main(String[] args) {
        Car maluch = new Car(25);
        System.out.println(maluch.getPower());
        System.out.println(maluch.wheel.getDiameter());
        //Tworzenie obiektu klasy wewnętrznej niestatycznej tylko na podstawie instancji klasy zewnętrznej!!!
        //klasa zewnętrza: Car
        //kklasa wewnętrzna publiczna: Wheel
        Car.Wheel wheel = maluch.new Wheel(6);

    }
}
