package day31_inheritance.vehicle;

import java.time.LocalDate;
import java.util.Arrays;

public class Boing extends AirPlane {

    public Boing(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
}
