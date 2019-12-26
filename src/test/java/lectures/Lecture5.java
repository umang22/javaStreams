package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();

    Predicate<Car> carPredicate = car -> car.getPrice() < 40000;
    List<Car> collect = cars.stream().filter(carPredicate).collect(Collectors.toList());
    System.out.println(collect);
    System.out.println(collect.size());
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();

    List<Object> objectList =
        people.stream()
            .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
            .collect(Collectors.toList());

    objectList.forEach(System.out::println);
    System.out.println(objectList.size());
  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices

  }

  @Test
  public void test() throws Exception {}
}
