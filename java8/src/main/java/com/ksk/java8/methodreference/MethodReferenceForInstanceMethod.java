import java.util.Arrays;
import java.util.List;

public class MethodReferenceForInstanceMethod{

    public void printDouble(int number){
        System.out.println(number * 2);
    }
    public static void main(String[] args) {
        MethodReferenceForInstanceMethod methodRef = new MethodReferenceForInstanceMethod();
        List<Integer> numbers = Arrays.asList(1,2,3);
        // numbers.forEach(number -> System.out.println(number));
        // numbers.forEach(number -> mr.printDouble(number));

        //object::methodName
        numbers.forEach(System.out::println);
        numbers.forEach(methodRef::printDouble);
    }
}