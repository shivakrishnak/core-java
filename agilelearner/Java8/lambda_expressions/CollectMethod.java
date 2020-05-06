import java.util.*;
import java.util.function.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;

public class CollectMethod{
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Jack", 21),
            new Person("Jill", 32),
            new Person("Michael", 25),
            new Person("Ram", 19),
            new Person("Raju", 45),
            new Person("Mary", 19),
            new Person("shiva", 25)
        );
        System.out.println(new Person("shiva", 43).equals(new Person("shiva", 25)));
        Function<Person, Integer> byAge = Person::getAge;
        
        System.out.println("========toList==========");
        List<Person> sortedList = people.stream()
                                .sorted(comparing(byAge))
                                .collect(toList());
        System.out.println(sortedList);

        System.out.println("=========toSet=========");
        Set<Person> sortedSet = people.stream()
                                      .sorted(comparing(byAge))
                                      .collect(toSet());
        System.out.println(sortedSet);

        System.out.println("=========toMap=========");
        // Function<Person, String> keyMapping = Person::getName;
        // Function<Person, Person> valueMapping = person -> person;
        // Map<String, Person> peopleMap = people.stream()
        //                                 .sorted(comparing(byAge))
        //                                 .collect(toMap(keyMapping, valueMapping));
        // System.out.println(peopleMap);

        Function<Person, Person> valueMapping = Function.identity();
        Map<String, Person> peopleMap = people.stream()
                                        .sorted(comparing(byAge))
                                        .collect(toMap(Person::getName, valueMapping));
        System.out.println(peopleMap);

    }
}