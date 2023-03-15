package day31_inheritance.vehicle;

import java.time.LocalDate;

public class Garage {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry", "White", LocalDate.of(2016,1,1), 16000);
        toyota.drive();
        Yacht yacht =new Yacht("ABC", "XYZ", "Blue", LocalDate.of(2021,2,2), 30000);
        yacht.sail();
    }
}
