package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("OLA","ELA","OLA", "KAROL", "ELA");
        Set<String> uniqueNames = new HashSet<>();

        for(String name: names){
            uniqueNames.add(name);
        }

        for(String name: uniqueNames){
            System.out.println(name);
        }

        System.out.println(uniqueNames.contains("ALA"));
    }
}
