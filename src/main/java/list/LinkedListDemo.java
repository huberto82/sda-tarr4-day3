package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALA","OLA","KAROL","STASZEK");
        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next+" ");
        }
        System.out.println();
        while(iterator.hasPrevious()){
            String prev = iterator.previous();
            System.out.print(prev +" ");
        }

        List<String> linked = new LinkedList<>();
        linked.add("FIAT");
        linked.add("BMW");
        linked.add("OPEL");
        linked.addAll(names);
        System.out.println("Czy jest Ola? " + linked.contains("OLA"));
    }
}
