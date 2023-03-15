package day31_inheritance.animal_methodOverriding;

public class Eagle extends Animal{
    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle "+ getName()+" Sleeps 3 hours");
    }
}
