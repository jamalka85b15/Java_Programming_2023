package day34_interface.carTask;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;


    public Car( String model, int year, double price, String color) {
        this.make = getClass().getSimpleName();
        this.model = model;
        if(year < 1886){
            System.out.println("Invalid year "+year);
            System.exit(1);
        }
        this.year = year;
        this.price = price;
        if(price <=0){
            System.out.println("Invalid price "+price);
            System.exit(1);
        }
        this.color = color;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            System.out.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();
    public final void stop(){
        System.out.println("Press the break");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
