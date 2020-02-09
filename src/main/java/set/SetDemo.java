package set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("OLA","ELA","OLA", "KAROL", "ELA");
        Set<String> uniqueNames = new TreeSet<>();

        for(String name: names){
            uniqueNames.add(name);
        }

        for(String name: uniqueNames){
            System.out.println(name);
        }

        System.out.println(uniqueNames.contains("ALA"));
    }
}
