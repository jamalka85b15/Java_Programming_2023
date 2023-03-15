package day31_inheritance.animal_methodOverriding;

public class Tiger extends Animal{

    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+ getName()+ " eats tiger food");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger "+ getName()+ " is sleeping 7 hours");
    }
}
