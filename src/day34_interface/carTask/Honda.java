package day34_interface.carTask;

import day34_interface.carTask.Car;

public class Honda extends Car {

    public Honda(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " is starting with farting");
    }


}
