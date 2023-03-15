package day29_inheritance.animalTask;

public class Tiger extends Animal {
    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){
        System.out.println(getName()+ " is hunting");
    }
}
