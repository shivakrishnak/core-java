import java.util.Arrays;
import java.util.List;

public class MethodReferenceForStaticMethod{

    public static void printDouble(int number){
        System.out.println(number * 2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        //numbers.forEach(num -> MethodReferenceForStaticMethod.printDouble(num));

        //ClassName::methodName
        numbers.forEach(MethodReferenceForStaticMethod::printDouble);
    }
}