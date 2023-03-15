package day35_polymorphism;

import day34_interface.animalTask.*;

public class PolimorphismIntro {
    public static void main(String[] args) {
       Dog dog= new Dog("Ceecee", "Corgi", "Meduim", "Brown", 'F', 2);
        Cat cat=new Cat("Kitty", "ABC", "Small", "White", 'M', 1);
        Tiger tiger=null;
        Lion lion=null;
        Animal[] animals = {dog, cat, tiger, lion};
    }
}
