package day34_interface.animalTask;

public class Person implements Playable,Swim{
    @Override
    public void play() {
        System.out.println("Person can play");
    }

    @Override
    public void swim() {
        System.out.println("Person can swim");
    }
}
