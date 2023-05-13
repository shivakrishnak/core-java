import java.util.*;
import java.util.Comparator;

public class SortMethod {
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
        System.out.println("Original Collection");
        people.forEach(System.out::println);
        System.out.println("Sorted Collection : Increasing Order");

        // people.stream()
        //       .sorted(new Comparator<Person>() {
        //           public int compare(Person p1, Person p2){
        //               return p1.getAge() - p2.getAge();
        //           }
        //       })
        //       .forEach(System.out::println);

        people.stream()
              .sorted((p1, p2) -> p1.getAge() - p2.getAge())
              .forEach(System.out::println);

        System.out.println("Sorted Collection : Decreasing Order");

        Comparator<Person> decreasingAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> increasingAge = decreasingAge.reversed();
        
        people.stream()
              .sorted(decreasingAge)
              .forEach(System.out::println);
    }
}