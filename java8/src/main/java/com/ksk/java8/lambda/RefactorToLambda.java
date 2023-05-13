import java.util.Arrays;
import java.util.List;


public class RefactorToLambda {

    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // for (Integer value : numbers) {
        //     System.out.println(value);
        // }

        // numbers.forEach(
        //     new Consumer<Integer>() {
        //         public void accept(Integer value) {
        //             System.out.println(value);
        //         }
        //     }
        // );

        numbers.forEach((Integer value) -> System.out.println(value));
        numbers.forEach(value -> System.out.println(value));

        numbers.forEach(System.out::println);
    }
}