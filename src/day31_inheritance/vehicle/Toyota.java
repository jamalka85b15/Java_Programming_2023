package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Toyota extends Car{

    public Toyota( String model, String color, LocalDate year, double price) {
        super("Toyota", model, color, year, price);
    }


}
