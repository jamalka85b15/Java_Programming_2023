package day26_statics;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("VW", "Atlas", 2021, 45000, "White");
        System.out.println(c1);
        Car c2 = new Car("BMW");
        System.out.println(c2);
    }
}
