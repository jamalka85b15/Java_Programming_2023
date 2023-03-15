package day31_inheritance.vehicle;

import java.time.LocalDate;

public class AirPlane extends Vehicle{

    public AirPlane(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println( getBrand()+ " "+getModel()+" is flying");
    }
}
