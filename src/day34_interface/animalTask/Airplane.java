package day34_interface.animalTask;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}
