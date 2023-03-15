package day31_inheritance.animal_methodOverriding;

public class Zoo2 {
    public static void main(String[] args) {
        Cat cat=new Cat("Kitty", "Bengal", "Small", "Brown", 'F', 5);
        cat.eat();
        cat.sleep();

        Tiger tiger=new Tiger("Taku", "ABC", "Large", "White", 'M', 5);
        tiger.eat();
        tiger.sleep();

        Dog dog=new Dog("Ceecee", "Corgi", "Medium", "Brown", 'F', 1);
        dog.eat();
        dog.sleep();
    }
}
