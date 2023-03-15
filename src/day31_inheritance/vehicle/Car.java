package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Car extends Vehicle{


    public Car(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
public void drive(){
    System.out.println(getBrand()+ " "+ getModel()+ " is driving");
}

}
