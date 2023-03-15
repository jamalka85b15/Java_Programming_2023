package day35_polymorphism;

import day34_interface.animalTask.Animal;
import day34_interface.animalTask.Dog;
import day34_interface.animalTask.Swim;
import day34_interface.animalTask.Tiger;

public class PolymorphismPractice {

    public static void main(String[] args) {
        Animal tiger=new Tiger("Sher", "Bengal", "Small","Gold", 'M', 5 );
        tiger.eat();
      // tiger.hunt(); if reference type Animal it will not call hunt method
        tiger.drink();
        boolean isFish = tiger instanceof Tiger;
        System.out.println(isFish);
    }
}
