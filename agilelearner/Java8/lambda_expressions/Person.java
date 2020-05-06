public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return String.format("Person[name = %s : age = %d]", name, age);
    }

    @Override
    public int hashCode(){
        return age;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Person){
            Person otherPerson = (Person)other;
            return age == otherPerson.age;
        }
        return false;
    }

}