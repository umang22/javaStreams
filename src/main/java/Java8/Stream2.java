package Java8;

import java.util.stream.Stream;

/*Sort Array of Strings ignoring the case and print them to System out*/
public class Stream2 {
    public static void main(String[] args) {
        String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        Stream.of(names).sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }
}
