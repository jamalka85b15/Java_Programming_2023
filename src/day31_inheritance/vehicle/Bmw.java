package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Bmw extends Car{

    public Bmw(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
}
