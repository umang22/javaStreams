package lectures;

import beans.Person;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    System.out.println("Inclusive");
    IntStream.range(0, 10).forEach(System.out::println);
    System.out.println("Exclusive");
    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size())
        .forEach(
            index -> {
              Person person = people.get(index);
              System.out.println(person);
            });
  }

  @Test
  public void intStreamIterate() throws Exception {


  }
}
