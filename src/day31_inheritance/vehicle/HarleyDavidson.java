package day31_inheritance.vehicle;

import java.time.LocalDate;

public class HarleyDavidson extends Bike{

    public HarleyDavidson(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
}
