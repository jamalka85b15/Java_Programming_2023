package day17_customClass;

public class TestDogClass {
    public static void main(String[] args) {

        Dog dog1 = new Dog();    //new Dog object
        dog1.name = "Maxi";
        dog1.color = "white";
        dog1.age = 5;
        dog1.size = "Large";
        dog1.breed = "Corgi";
        dog1.dring();
        System.out.println(dog1);

        Dog dog2 = new Dog(); // new Dog object
        dog2.name = "Ceecee";
        dog2.size = "Midium";
        dog2.breed = "Bulldog";
        dog2.age = 3;
        dog2.color = "Black";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Boomer", "Husky", "Midium", "Brown", 1);
        System.out.println(dog3);

        dog3.eat();

        Cars car1 = new Cars();
        car1.setInfo("BMW", "X7", 2023, "White", 50000);
        System.out.println(car1);


        Students student1 = new Students();
        student1.setInfo("Jama", 'F', 37, "A1B22", "MBA", true);
        System.out.println(student1);
        student1.study();

        Rectangle rec1 =new Rectangle();
        rec1.setInfo(17,8);
        System.out.println(rec1);

        SalaryCalculator sal1=new SalaryCalculator();
        sal1.setInfo(47,6.25, 30, 40 );
        System.out.println(sal1);

    }
}
