package day35_polymorphism.interfaceTask;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " Can autopark");
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+ " can trsnport 5 people");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " is start by button");
    }
}
