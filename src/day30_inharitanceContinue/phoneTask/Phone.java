package day30_inharitanceContinue.phoneTask;

import java.util.Arrays;

public class Phone {
    private String brand, model, color, size;
    private double price;


    //*** Constructor ***//
    public Phone(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        String[] colors = {"Black", "White", "Silver", " Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println(" Invalid color " + color + "\n color can only be " + Arrays.asList(colors));
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

// *** toString ***
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
    public void call(long phoneNumber){
        System.out.println(getModel()+" is calling to "+phoneNumber );
    }
    public void text(long phoneNumber){
        System.out.println(getModel()+" is texting to "+phoneNumber);
    }

}
