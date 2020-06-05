package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStream {
    public static void main(String[] args) {

        /*Example 1 */
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(s -> System.out.print(s + " "));

        /*Example 2*/
        System.out.println();
        System.out.println("Example 2......................");
        System.out.println("Stream.of(arrayOfElements)");
        Stream stream1 = Stream.of(new Integer[]{1, 2, 4, 6, 7, 8, 9, 9});
        stream1.forEach(s -> System.out.print(s + " "));

        /*Example 3*/
        System.out.println();
        System.out.println("Example 3...................");
        System.out.println("List.stream()");

        List list = new ArrayList();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        Stream stream2 = Stream.of(list);
        stream2.forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("2.4. Stream.generate() or Stream.iterate()\n");
        /*Stream<Date> dateStream = Stream.generate(() -> {
            return new Date();
        });
        dateStream.forEach(ds-> System.out.println(ds));*/

        /*Example 4 */
        System.out.println();
        System.out.println("3.1. Convert Stream to List – Stream.collect( Collectors.toList() )");
        List list1 = new ArrayList();
        for (int i = 0; i < 8; i++) {
            list1.add(i);
        }

        Stream<Integer> stream3 = list1.stream();
        List<Integer> evenNumberList = stream3.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        System.out.println();
        System.out.println("3.2. Convert Stream to array – Stream.toArray( EntryType[]::new )");
        List list2 = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list2.add(i);
        }

        Stream<Integer> stream4 = list2.stream();
        Integer[] evenNumberArray = stream4.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        for (Integer integer : evenNumberArray) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }
}
