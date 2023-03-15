package day34_interface.animalTask;

public class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat bird food");
    }

    @Override
    public void play() {
        System.out.println("Play with mirror");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly");
    }
}
