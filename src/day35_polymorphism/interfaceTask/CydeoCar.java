package day35_polymorphism.interfaceTask;

import day34_interface.animalTask.Flyable;
import day34_interface.animalTask.Swim;

public class CydeoCar extends Car implements AutoPilot, Swim, Flyable,Electric {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+ getModel()+ " is flying");
    }

    @Override
    public void swim() {
        System.out.println(getMake()+" "+ getModel()+ " is swimming");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+ getModel()+ " is auto parking");
    }

    @Override
    public void autoPilot() {
        System.out.println(getMake()+" "+ getModel()+ " is auto piloting");
    }

    @Override
    public void charge() {
        System.out.println(getMake()+" "+ getModel()+ " is charging");
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+" "+ getModel()+ " is transport");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+ getModel()+ " is starts easy");
    }
}
