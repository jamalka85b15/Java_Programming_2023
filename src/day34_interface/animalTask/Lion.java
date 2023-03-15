package day34_interface.animalTask;

public class Lion extends Animal implements Wild{
    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat can food");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is wild");
    }
}
