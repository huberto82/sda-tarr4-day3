package inner;

public class Email {
    private String message;
    private Address address;
    private static final String MALPA = "@";

    public Email(String message, Address address) {
        this.message = message;
        this.address = address;
    }
    //Klasa zewnętrzna ma dostep do wszystkich pól klasy wewnętrznej statycznej dlatego możemy
    //wywołać metodę prywatną getAddress() z klasy Address
    public String getAddress(){
        return address.getAddress();
    }

    public static class Address{
        private String name;
        private String host;

        public Address(String name, String host) {
            this.name = name;
            this.host = host;
        }

        private String getAddress(){
            //Klasa wewnętrza ma dostęp do wszystkich pól klasy zewnętrznej ale tylko statycznych!!!
            return name + MALPA + host;
        }
    }
}
