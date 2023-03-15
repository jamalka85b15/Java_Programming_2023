package day34_interface.carTask;

public class Audi extends Car {

    public Audi(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " is starting with farting");
    }

    public void autoPark(){
        System.out.println("Press the break");
    }

}
