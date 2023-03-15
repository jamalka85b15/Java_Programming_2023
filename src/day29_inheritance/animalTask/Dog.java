package day29_inheritance.animalTask;

public class Dog extends Animal { //Dog is animal
    // child/Sub        parent/Super


    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
       System.out.println(getName()+ " is barking");

       /* public void method(){
            System.out.println(name);
            System.out.println(breed);
            System.out.println(age);
            System.out.println(size);

            eat();*/

        }


    }



