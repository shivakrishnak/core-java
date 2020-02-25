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
    default void steer(){
        System.out.println("FastFly:steer");
    }
}

class Vehicle{
    public void takeOff(){
        System.out.println("Vehicle:takeOff");
    }
}

class SeaPlane extends Vehicle implements FastFly,Fly{
    public void steer(){
        System.out.println("SeaPlane:steer");
    }
}

public class DefaultMethod4{
    public static void main(String[] args) {
        System.out.println("Okay");
        SeaPlane plane = new SeaPlane();
        plane.fly();
        plane.cruise();
        plane.takeOff();
        plane.steer();
    }
}
