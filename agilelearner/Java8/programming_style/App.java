import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob","jack","sarah","jil","tom");

        // String personWith3Letter = "";
        // boolean found = false;
        // for (String name : names) {
        //     if(name == "tom"){
        //         personWith3Letter = name;
        //         found = true;
        //         break;
        //     }
            
        // }
        // if(found){
        //     System.out.println("Person Found is " + personWith3Letter);
        // } else {
        //     System.out.println("Person Not Found");
        // }

        System.out.println(
            names.stream()
                .filter(name -> name.length() == 9)
                .findFirst().orElse("Person Not Found")
        );
    }

}