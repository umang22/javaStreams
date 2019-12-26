package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

import javax.xml.stream.StreamFilter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    List<Person> personList = Lists.newArrayList();

    int counter = 0;

    for (Person person : people) {
      if (person.getAge() <= 18) {
        personList.add(person);
        counter++;
        if (counter <= 10)
        System.out.println(person);
      }
    }
    // 2. Then change implementation to find first 10 people

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

      List<Person> personList = people.stream().filter(person -> person.getAge() >= 18)
              .limit(10).collect(Collectors.toList());
      personList.forEach(System.out::println);


  }
}
