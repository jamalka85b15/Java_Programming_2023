package day34_interface.animalTask;

public class Duck extends Animal implements Flyable{

    public Duck(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat duck's food");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
}
