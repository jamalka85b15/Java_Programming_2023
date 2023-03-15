package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Yacht extends Boat{

    public Yacht(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
}
