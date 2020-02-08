package inner;

public class EmailApp {
    public static void main(String[] args) {
        //Klasa wewnętrzna statyczna jest niezależna od klasy zewnętrznej
        //Możemy tworzyć obiekty tej Address bez instancji klasy Email
        Email.Address adresAli = new Email.Address("ala","op.pl");
        Email email = new Email("Hello", adresAli);
        System.out.println(email.getAddress());
    }
}
