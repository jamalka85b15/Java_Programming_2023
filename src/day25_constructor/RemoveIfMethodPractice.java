package day25_constructor;

import day17_customClass.Dog;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", "Gray", 4);
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", "Gold", 8);
        dogs[2].setInfo("Molly", "Beagle", "Small", "White",5);
        dogs[3].setInfo("Oliver", "Bulldog", "Small", "Black", 2);
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", "White", 3);
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", "Gold",7);

        ArrayList<Dog>  smallDogs = new ArrayList<>();

        for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }
            
        }
        System.out.println(Arrays.toString(dogs));
        System.out.println(smallDogs);

        ArrayList<Dog>  youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age > 4);
       /* for (Dog dog : dogs) {
            if(dog.age < 4){
                youngDogs.add(dog);
            }*/

        System.out.println(youngDogs);


        
    }

}
