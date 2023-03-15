package day32_finalKeyWord.carTask_MethodOverriding;

import java.time.LocalDate;

public class Car {
    private String make, model, color;
    private double price;
    private int year;
    public static int numberOfWheel;
    public static boolean hasBattery;

    static {
        numberOfWheel = 4;
        hasBattery = true;
    }

    public Car( String model, String color, double price, int year) {
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setPrice(price);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.out.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getYear(int year) {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Invalid year "+year);
            System.exit(1);
        }
        this.year = year;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ignation to start "+ make+ " "+model);
    }
}
