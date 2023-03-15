package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Boat extends Vehicle{

    public Boat(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail(){
        System.out.println(getBrand()+" "+ getModel()+" is sailing");
    }
}
