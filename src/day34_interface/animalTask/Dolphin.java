package day34_interface.animalTask;


public class Dolphin extends Animal implements Swim{

    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat dolphin's food");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim");
    }
}
