interface Fly{
    default void fly(){
        System.out.println("Fly:fly");
    }
    default void cruise(){
        System.out.println("Fly:cruise");
    }
    default void takeOff(){
        System.out.println("Fly:takeOff");
    }
    default void steer(){
        System.out.println("Fly:steer");
    }
}

interface FastFly extends Fly{
    default void cruise(){
        System.out.println("FlyStan:cruise");
    }
}

class SeaPlane implements FastFly{

}

public class DefaultMethod2{
    public static void main(String[] args) {
        System.out.println("Okay");
        SeaPlane plane = new SeaPlane();
        plane.fly();
        plane.cruise();
    }
}
