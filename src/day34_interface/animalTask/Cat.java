package day34_interface.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat cat's food");
    }

    @Override
    public void play() {
        System.out.println("Playing with ball");
    }
}
