package day36_polimorphismContinue;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inharitanceContinue.phoneTask.Nokia;
import day30_inharitanceContinue.phoneTask.Phone;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        //Dog dog= new Dog();
       // Cat cat =new Dog();
        Animal animal=new Dog("ceecee", "Corgi", "Small", "Brown", 'F', 2);
        ((Dog)animal).bark();
        Dog dog =(Dog)animal;
        dog.bark();
       //((Cat)animal).scratch();  it will get Reeference Type Casting error because no is a relationship

        System.out.println("---------------------");
        Phone phone= new Nokia("Nokie", "TT","Black", "128GB", 150);
        ((Nokia)phone).selfDefence();  // needs downcasting bacause Phone has no selfDefence method

    }
}
