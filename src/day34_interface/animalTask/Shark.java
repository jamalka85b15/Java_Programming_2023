package day34_interface.animalTask;

public class Shark extends Animal implements Swim{
    public Shark(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat shark's food");
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim");
    }
}
