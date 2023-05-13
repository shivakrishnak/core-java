import java.util.*;
import java.util.function.*;
import static java.util.Comparator.comparing;

public class SortMethod2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Jack", 21), new Person("Jill", 32), new Person("Michael", 25),
                new Person("Ram", 19), new Person("Raju", 45), new Person("Mary", 19), new Person("shiva", 25));

        //Function<Person, Integer> byAge = person -> person.getAge();
        Function<Person, Integer> byAge = Person::getAge;

        // printInSortedOrder("Sorted by Increasing Order of Age", people, 
        //                         comparing(byAge));

        printInSortedOrder("Sorted by Increasing Order of Age", people, 
                                comparing(Person::getAge));

        printInSortedOrder("Sorted by Decreasing Order of Age", people, 
                                comparing(byAge).reversed());

    }

    public static void printInSortedOrder(String message, List<Person> people, Comparator<Person> comparator) {
        System.out.println(message);
        people.stream()
            .sorted(comparator)
            .forEach(System.out::println);
    }
}