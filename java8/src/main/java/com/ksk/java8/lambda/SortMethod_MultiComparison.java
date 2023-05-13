import java.util.*;
import java.util.function.*;
import static java.util.Comparator.comparing;

public class SortMethod_MultiComparison {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Jack", 21),
            new Person("Jill", 32),
            new Person("Michael", 25),
            new Person("Ram", 19),
            new Person("Raju", 45),
            new Person("Mary", 55),
            new Person("shiva", 25),
            new Person("Michael", 67)
        );

        Function<Person, Integer> byAge = Person::getAge;
        Function<Person, String> byName = Person::getName;
    
        printInSortedOrder("Sorted by Age and Name", people, 
                            comparing(Person::getAge).thenComparing(Person::getName));

        printInSortedOrder("Sorted by  Name and Age", people,
                            comparing(byName).thenComparing(byAge));

        printInSortedOrder("Sorted by  Name and Decreasing Age", people,
                            comparing(byName).thenComparing(comparing(byAge).reversed()));

    }

    public static void printInSortedOrder(String message, List<Person> people, Comparator<Person> comparator) {
        System.out.println(message);
        people.stream().sorted(comparator).forEach(System.out::println);
    }
}