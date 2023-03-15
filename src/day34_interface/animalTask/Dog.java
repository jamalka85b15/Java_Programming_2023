package day34_interface.animalTask;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat dog food");
    }

    @Override
    public void play() {
        System.out.println("Play with dog toy");
    }
}
