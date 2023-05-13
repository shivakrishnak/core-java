import java.util.Arrays;
import java.util.List;

public class Streams1 {


    public interface Fly{
        default void takeOff(){
            System.out.println("Fly:takeOff");
        }
        static void fly(){
            System.out.println("Fly:Flying");
        }
    }

    public class Vehicle implements Fly{
        public void run() {
            Fly.fly();

        }
    }

    public void name() {
        Vehicle veh = new Vehicle();
        veh.run(); 
        veh.takeOff();
    }
    public static void main(String[] args) {

        new App().name();
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