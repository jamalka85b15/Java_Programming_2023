package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Cat c1= new Cat("Spring", "Bagira", "Small", "Gold", 'F', 8);
        //c1.name="Kitty";
        c1.drink();
        c1.meow();
        System.out.println(c1);

        System.out.println(c1);

        Dog d1= new Dog("Ceecee", "Corgi", "Miduim", "Brown", 'F', 1);
        System.out.println(d1);
        d1.bark();

        Tiger t1 = new Tiger("Timmy", "Soemthing", "Large", "White", 'M', 12);

        Tiger t2 = new Tiger("Timmy", "Soemthing", "Large", "White", 'M', 12);

        System.out.println(t1);
        t1.hunt();
        System.out.println(t1.equals(t2));

    }
}
