class Human {
    private int age = 42;
}

class Company {
    Human human = new Human();
    Field field = Human.class.getDeclaredField("age");
    field.setAccessible(true);
    int ageValue = (int) field.get(human);
}