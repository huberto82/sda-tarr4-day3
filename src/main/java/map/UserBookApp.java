package map;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserBookApp {
    public static void main(String[] args) {
        //komparator decyduje o unikalności kluczy
        //najpierw wybieramy klucze najkrótsze, a jeśli są tej samej długości
        //to decyduje kolejność alfabetyczna
        //Komparator zdefiniowany jako obiekt klasy anonimowej
        Map<String, User> users = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()){
                    return -1;
                }
                if (o1.length() > o2.length()){
                    return 1;
                }
                return o1.compareTo(o2);
            }
        });
        users.put("ALA", new User("ALA","ala@op.pl", LocalDate.of(2000,10,10)));
        users.put("OLA", new User("OLA","ola@wp.pl",LocalDate.of(1999, 12,23)));
        users.put("ADAM", new User("ADAM","ad@wp.pl",LocalDate.of(1999, 5,2)));
        for(Map.Entry<String,User> pair: users.entrySet()){
            System.out.println(pair.getValue());
        }

    }
}
