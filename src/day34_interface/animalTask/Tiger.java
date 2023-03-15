package day34_interface.animalTask;

public class Tiger extends Animal implements Wild{

    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat tiger's food");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger is wild");
    }
}
