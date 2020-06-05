package Java8;

import java.util.HashMap;
import java.util.Map;

/*
 * program to sort name based on there lenght using java 8 streams
 *
 */
public class Stream1 {

    public static void main(String[] args) {
//        String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
//        Stream.of(names).sorted((Comparator.comparingInt(String::length))).forEach(System.out::println);
        Map map = new HashMap();
        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "Charles");
        map.forEach((k, v) -> System.out.println(k + " " + v));


    }
}
