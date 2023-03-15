package day34_interface.carTask;

import day34_interface.carTask.Car;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " is starting with farting");
    }
    public void autoPilot(){
        System.out.println("Autopilot");
    }

}
