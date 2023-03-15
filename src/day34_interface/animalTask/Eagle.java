package day34_interface.animalTask;

public class Eagle extends Animal implements Flyable,Wild{

    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat eagle food");
    }

    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle is wild");
    }
}
